import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class76_Sub1 extends Class76 {

	@OriginalMember(owner = "client!ue", name = "S", descriptor = "[Z")
	private volatile boolean[] aBooleanArray20;

	@OriginalMember(owner = "client!ue", name = "hb", descriptor = "I")
	private int anInt4349;

	@OriginalMember(owner = "client!ue", name = "kb", descriptor = "I")
	private int anInt4351;

	@OriginalMember(owner = "client!ue", name = "jb", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
	private int anInt4345 = -1;

	@OriginalMember(owner = "client!ue", name = "ub", descriptor = "Z")
	private volatile boolean aBoolean171 = false;

	@OriginalMember(owner = "client!ue", name = "tb", descriptor = "I")
	private final int anInt4355;

	@OriginalMember(owner = "client!ue", name = "pb", descriptor = "Lclient!be;")
	private final Class9 aClass9_3;

	@OriginalMember(owner = "client!ue", name = "qb", descriptor = "Lclient!be;")
	private final Class9 aClass9_4;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lclient!be;Lclient!be;IZZZ)V")
	public Class76_Sub1(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt4355 = arg2;
		this.aClass9_3 = arg0;
		this.aClass9_4 = arg1;
		this.aBoolean169 = arg5;
		Static104.method2191(this, this.anInt4355);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)I")
	public int method3332() {
		if (this.aBoolean171) {
			return 100;
		} else if (super.anObjectArray29 == null) {
			@Pc(29) int local29 = Static159.method3180(this.anInt4355, 255);
			if (local29 >= 100) {
				local29 = 99;
			}
			return local29;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BI)I")
	private int method3333(@OriginalArg(1) int arg0) {
		if (super.anObjectArray29[arg0] == null) {
			return this.aBooleanArray20[arg0] ? 100 : Static159.method3180(arg0, this.anInt4355);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIZ[BZ)V")
	public void method3335(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg2[arg2.length - 2] = (byte) (super.anIntArray413[arg0] >> 8);
			arg2[arg2.length - 1] = (byte) super.anIntArray413[arg0];
			if (this.aClass9_3 != null) {
				Static142.method2800(arg0, this.aClass9_3, arg2);
				this.aBooleanArray20[arg0] = true;
			}
			if (arg1) {
				super.anObjectArray29[arg0] = Static21.method469(arg2);
			}
		} else if (this.aBoolean171) {
			throw new RuntimeException();
		} else {
			if (this.aClass9_4 != null) {
				Static142.method2800(this.anInt4355, this.aClass9_4, arg2);
			}
			this.method3308(arg2);
			this.method3341();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!be;[BIIZ)V")
	public void method3336(@OriginalArg(0) Class9 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(71) int local71;
		if (this.aClass9_4 != arg0) {
			if (!arg3 && arg2 == this.anInt4345) {
				this.aBoolean171 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray20[arg2] = false;
				if (this.aBoolean169 || arg3) {
					Static85.method1885(this.anInt4355, arg2, (byte) 2, arg3, this, super.anIntArray414[arg2]);
				}
			} else {
				Static64.aCRC32_3.reset();
				Static64.aCRC32_3.update(arg1, 0, arg1.length - 2);
				local71 = (int) Static64.aCRC32_3.getValue();
				@Pc(92) int local92 = ((arg1[arg1.length - 2] & 0xFF) << 8) + (arg1[arg1.length - 1] & 0xFF);
				if (local71 == super.anIntArray414[arg2] && local92 == super.anIntArray413[arg2]) {
					this.aBooleanArray20[arg2] = true;
					if (arg3) {
						super.anObjectArray29[arg2] = Static21.method469(arg1);
					}
				} else {
					this.aBooleanArray20[arg2] = false;
					if (this.aBoolean169 || arg3) {
						Static85.method1885(this.anInt4355, arg2, (byte) 2, arg3, this, super.anIntArray414[arg2]);
					}
				}
			}
		} else if (this.aBoolean171) {
			throw new RuntimeException();
		} else if (arg1 == null) {
			Static85.method1885(255, this.anInt4355, (byte) 0, true, this, this.anInt4349);
		} else {
			Static64.aCRC32_3.reset();
			Static64.aCRC32_3.update(arg1, 0, arg1.length);
			local71 = (int) Static64.aCRC32_3.getValue();
			@Pc(188) Class1_Sub9 local188 = new Class1_Sub9(Static132.method2566(arg1));
			@Pc(192) int local192 = local188.method1234();
			if (local192 != 5 && local192 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local192);
			}
			@Pc(215) int local215 = 0;
			if (local192 >= 6) {
				local215 = local188.method1273();
			}
			if (this.anInt4349 == local71 && this.anInt4351 == local215) {
				this.method3308(arg1);
				this.method3341();
			} else {
				Static85.method1885(255, this.anInt4355, (byte) 0, true, this, this.anInt4349);
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)V")
	public void method3337(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4349 = arg1;
		this.anInt4351 = arg0;
		if (this.aClass9_4 == null) {
			Static85.method1885(255, this.anInt4355, (byte) 0, true, this, this.anInt4349);
		} else {
			Static42.method1037(this.aClass9_4, this, this.anInt4355);
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(II)V")
	@Override
	protected void method3325(@OriginalArg(0) int arg0) {
		Static181.method3473(this.anInt4355, arg0);
	}

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
	public int method3339() {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(16) int local16 = 0; super.anObjectArray29.length > local16; local16++) {
			if (super.anIntArray416[local16] > 0) {
				local3 += 100;
				local9 += this.method3333(local16);
			}
		}
		if (local3 == 0) {
			return 100;
		} else {
			return local9 * 100 / local3;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
	private void method3341() {
		this.aBooleanArray20 = new boolean[super.anObjectArray29.length];
		for (@Pc(19) int local19 = 0; local19 < this.aBooleanArray20.length; local19++) {
			this.aBooleanArray20[local19] = false;
		}
		if (this.aClass9_3 == null) {
			this.aBoolean171 = true;
			return;
		}
		this.anInt4345 = -1;
		for (@Pc(48) int local48 = 0; local48 < this.aBooleanArray20.length; local48++) {
			if (super.anIntArray416[local48] > 0) {
				Static69.method1572(this.aClass9_3, this, local48);
				this.anInt4345 = local48;
			}
		}
		if (this.anInt4345 == -1) {
			this.aBoolean171 = true;
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(II)V")
	@Override
	protected void method3331(@OriginalArg(1) int arg0) {
		if (this.aClass9_3 == null || this.aBooleanArray20 == null || !this.aBooleanArray20[arg0]) {
			Static85.method1885(this.anInt4355, arg0, (byte) 2, true, this, super.anIntArray414[arg0]);
		} else {
			Static42.method1037(this.aClass9_3, this, arg0);
		}
	}
}
