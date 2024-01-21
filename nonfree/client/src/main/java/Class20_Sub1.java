import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
	private int anInt944;

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
	private int anInt946;

	@OriginalMember(owner = "client!ga", name = "Ab", descriptor = "[Z")
	private volatile boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "Z")
	private volatile boolean aBoolean97 = false;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
	private int anInt942 = -1;

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "Lclient!tb;")
	private final Class71 aClass71_2;

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "Lclient!tb;")
	private final Class71 aClass71_1;

	@OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
	private final int anInt941;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!tb;Lclient!tb;IZZZ)V")
	public Class20_Sub1(@OriginalArg(0) Class71 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass71_2 = arg1;
		this.aClass71_1 = arg0;
		this.aBoolean98 = arg5;
		this.anInt941 = arg2;
		Static44.method859(this.anInt941, this);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZIZZ[B)V")
	public void method613(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2) {
			if (this.aBoolean97) {
				throw new RuntimeException();
			}
			if (this.aClass71_2 != null) {
				Static23.method394(this.aClass71_2, this.anInt941, arg3);
			}
			this.method600(arg3);
			this.method619();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray106[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray106[arg1];
		if (this.aClass71_1 != null) {
			Static23.method394(this.aClass71_1, arg1, arg3);
			this.aBooleanArray2[arg1] = true;
		}
		if (arg0) {
			super.anObjectArray28[arg1] = Static60.method1111(arg3);
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(BI)V")
	@Override
	protected void method596(@OriginalArg(1) int arg0) {
		Static27.method435(this.anInt941, arg0);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)V")
	public void method614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt944 = arg0;
		this.anInt946 = arg1;
		if (this.aClass71_2 == null) {
			Static105.method1729(true, (byte) 0, this.anInt941, 255, this, this.anInt946);
		} else {
			Static73.method1205(this.anInt941, this, this.aClass71_2);
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)I")
	public int method616() {
		if (this.aBoolean97) {
			return 100;
		} else if (super.anObjectArray28 == null) {
			@Pc(26) int local26 = Static51.method991(this.anInt941, 255);
			if (local26 >= 100) {
				local26 = 99;
			}
			return local26;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(BI)I")
	private int method617(@OriginalArg(1) int arg0) {
		if (super.anObjectArray28[arg0] == null) {
			return this.aBooleanArray2[arg0] ? 100 : Static51.method991(arg0, this.anInt941);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ[BILclient!tb;)V")
	public void method618(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class71 arg3) {
		@Pc(71) int local71;
		if (this.aClass71_2 != arg3) {
			if (!arg0 && arg2 == this.anInt942) {
				this.aBoolean97 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray2[arg2] = false;
				if (this.aBoolean98 || arg0) {
					Static105.method1729(arg0, (byte) 2, arg2, this.anInt941, this, super.anIntArray109[arg2]);
				}
			} else {
				Static112.aCRC32_2.reset();
				Static112.aCRC32_2.update(arg1, 0, arg1.length - 2);
				local71 = (int) Static112.aCRC32_2.getValue();
				@Pc(91) int local91 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
				if (super.anIntArray109[arg2] == local71 && super.anIntArray106[arg2] == local91) {
					this.aBooleanArray2[arg2] = true;
					if (arg0) {
						super.anObjectArray28[arg2] = Static60.method1111(arg1);
					}
				} else {
					this.aBooleanArray2[arg2] = false;
					if (this.aBoolean98 || arg0) {
						Static105.method1729(arg0, (byte) 2, arg2, this.anInt941, this, super.anIntArray109[arg2]);
					}
				}
			}
		} else if (this.aBoolean97) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static105.method1729(true, (byte) 0, this.anInt941, 255, this, this.anInt946);
		} else {
			Static112.aCRC32_2.reset();
			Static112.aCRC32_2.update(arg1, 0, arg1.length);
			local71 = (int) Static112.aCRC32_2.getValue();
			@Pc(185) Class4_Sub11 local185 = new Class4_Sub11(Static79.method1431(arg1));
			@Pc(189) int local189 = local185.method719();
			if (local189 != 5 && local189 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local189);
			}
			@Pc(210) int local210 = 0;
			if (local189 >= 6) {
				local210 = local185.method725();
			}
			if (this.anInt946 == local71 && local210 == this.anInt944) {
				this.method600(arg1);
				this.method619();
			} else {
				Static105.method1729(true, (byte) 0, this.anInt941, 255, this, this.anInt946);
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V")
	private void method619() {
		this.aBooleanArray2 = new boolean[super.anObjectArray28.length];
		for (@Pc(9) int local9 = 0; local9 < this.aBooleanArray2.length; local9++) {
			this.aBooleanArray2[local9] = false;
		}
		if (this.aClass71_1 == null) {
			this.aBoolean97 = true;
			return;
		}
		this.anInt942 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray2.length; local38++) {
			if (super.anIntArray107[local38] > 0) {
				Static108.method1769(local38, this.aClass71_1, this);
				this.anInt942 = local38;
			}
		}
		if (this.anInt942 == -1) {
			this.aBoolean97 = true;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	@Override
	protected void method590(@OriginalArg(0) int arg0) {
		if (this.aClass71_1 == null || this.aBooleanArray2 == null || !this.aBooleanArray2[arg0]) {
			Static105.method1729(true, (byte) 2, arg0, this.anInt941, this, super.anIntArray109[arg0]);
		} else {
			Static73.method1205(arg0, this, this.aClass71_1);
		}
	}

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)I")
	public int method621() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray28.length; local11++) {
			if (super.anIntArray107[local11] > 0) {
				local7 += this.method617(local11);
				local9 += 100;
			}
		}
		if (local9 == 0) {
			return 100;
		} else {
			return local7 * 100 / local9;
		}
	}
}
