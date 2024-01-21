import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
	private int anInt967;

	@OriginalMember(owner = "client!eb", name = "gb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!eb", name = "nb", descriptor = "Z")
	private volatile boolean aBoolean54 = false;

	@OriginalMember(owner = "client!eb", name = "vb", descriptor = "Z")
	private boolean aBoolean55 = false;

	@OriginalMember(owner = "client!eb", name = "zb", descriptor = "I")
	private int anInt980 = -1;

	@OriginalMember(owner = "client!eb", name = "U", descriptor = "Lclient!cb;")
	private final Class12 aClass12_2;

	@OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!eb", name = "tb", descriptor = "Lclient!cb;")
	private final Class12 aClass12_3;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!cb;Lclient!cb;IZZZ)V")
	public Class16_Sub1(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass12_2 = arg1;
		this.aBoolean55 = arg5;
		this.anInt965 = arg2;
		this.aClass12_3 = arg0;
		Static105.method1953(this.anInt965, this);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
	public void method580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt961 = arg1;
		this.anInt967 = arg0;
		if (this.aClass12_2 == null) {
			Static17.method272(this.anInt961, this.anInt965, this, (byte) 0, 255, true);
		} else {
			Static94.method1701(this, this.anInt965, this.aClass12_2);
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)I")
	public int method581() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray2.length; local11++) {
			if (super.anIntArray95[local11] > 0) {
				local7 += 100;
				local9 += this.method589(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)V")
	@Override
	protected void method568(@OriginalArg(1) int arg0) {
		if (this.aClass12_3 == null || this.aBooleanArray8 == null || !this.aBooleanArray8[arg0]) {
			Static17.method272(super.anIntArray94[arg0], arg0, this, (byte) 2, this.anInt965, true);
		} else {
			Static94.method1701(this, arg0, this.aClass12_3);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!cb;I[BZZ)V")
	public void method582(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		@Pc(43) int local43;
		if (arg0 != this.aClass12_2) {
			if (!arg3 && arg1 == this.anInt980) {
				this.aBoolean54 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray8[arg1] = false;
				if (this.aBoolean55 || arg3) {
					Static17.method272(super.anIntArray94[arg1], arg1, this, (byte) 2, this.anInt965, arg3);
				}
			} else {
				Static70.aCRC32_2.reset();
				Static70.aCRC32_2.update(arg2, 0, arg2.length - 2);
				local43 = (int) Static70.aCRC32_2.getValue();
				@Pc(181) int local181 = ((arg2[arg2.length - 2] & 0xFF) << 8) + (arg2[arg2.length - 1] & 0xFF);
				if (super.anIntArray94[arg1] == local43 && local181 == super.anIntArray99[arg1]) {
					this.aBooleanArray8[arg1] = true;
					if (arg3) {
						super.anObjectArray2[arg1] = Static108.method1979(arg2);
					}
				} else {
					this.aBooleanArray8[arg1] = false;
					if (this.aBoolean55 || arg3) {
						Static17.method272(super.anIntArray94[arg1], arg1, this, (byte) 2, this.anInt965, arg3);
					}
				}
			}
		} else if (this.aBoolean54) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static17.method272(this.anInt961, this.anInt965, this, (byte) 0, 255, true);
		} else {
			Static70.aCRC32_2.reset();
			Static70.aCRC32_2.update(arg2, 0, arg2.length);
			local43 = (int) Static70.aCRC32_2.getValue();
			@Pc(50) Class3_Sub11 local50 = new Class3_Sub11(Static109.method1999(arg2));
			@Pc(54) int local54 = local50.method981();
			if (local54 != 5 && local54 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local54);
			}
			@Pc(75) int local75 = 0;
			if (local54 >= 6) {
				local75 = local50.method984();
			}
			if (local43 == this.anInt961 && this.anInt967 == local75) {
				this.method576(arg2);
				this.method590();
			} else {
				Static17.method272(this.anInt961, this.anInt965, this, (byte) 0, 255, true);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZIZ[B)V")
	public void method586(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (arg0) {
			if (this.aBoolean54) {
				throw new RuntimeException();
			}
			if (this.aClass12_2 != null) {
				Static32.method629(this.anInt965, arg3, this.aClass12_2);
			}
			this.method576(arg3);
			this.method590();
			return;
		}
		arg3[arg3.length - 2] = (byte) (super.anIntArray99[arg1] >> 8);
		arg3[arg3.length - 1] = (byte) super.anIntArray99[arg1];
		if (this.aClass12_3 != null) {
			Static32.method629(arg1, arg3, this.aClass12_3);
			this.aBooleanArray8[arg1] = true;
		}
		if (arg2) {
			super.anObjectArray2[arg1] = Static108.method1979(arg3);
			return;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	@Override
	protected void method563(@OriginalArg(0) int arg0) {
		Static28.method593(arg0, this.anInt965);
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public int method587() {
		if (this.aBoolean54) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(27) int local27 = Static42.method810(255, this.anInt965);
			if (local27 >= 100) {
				local27 = 99;
			}
			return local27;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)I")
	private int method589(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray8[arg0] ? 100 : Static42.method810(this.anInt965, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	private void method590() {
		this.aBooleanArray8 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray8.length; local13++) {
			this.aBooleanArray8[local13] = false;
		}
		if (this.aClass12_3 == null) {
			this.aBoolean54 = true;
			return;
		}
		this.anInt980 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray8.length; local42++) {
			if (super.anIntArray95[local42] > 0) {
				Static3.method51(this.aClass12_3, this, local42);
				this.anInt980 = local42;
			}
		}
		if (this.anInt980 == -1) {
			this.aBoolean54 = true;
		}
	}
}
