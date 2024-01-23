import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!vb", name = "lb", descriptor = "I")
	private int anInt4557;

	@OriginalMember(owner = "client!vb", name = "wb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray26;

	@OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
	private int anInt4566;

	@OriginalMember(owner = "client!vb", name = "kb", descriptor = "Z")
	private boolean aBoolean206 = false;

	@OriginalMember(owner = "client!vb", name = "pb", descriptor = "I")
	private int anInt4560 = -1;

	@OriginalMember(owner = "client!vb", name = "mb", descriptor = "Z")
	private volatile boolean aBoolean207 = false;

	@OriginalMember(owner = "client!vb", name = "rb", descriptor = "Lclient!s;")
	private Class100 aClass100_94;

	@OriginalMember(owner = "client!vb", name = "vb", descriptor = "Lclient!s;")
	private Class100 aClass100_95;

	@OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
	private int anInt4562;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!s;Lclient!s;IZZZ)V")
	public Class70_Sub1(@OriginalArg(0) Class100 arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass100_94 = arg1;
		this.aBoolean206 = arg5;
		this.aClass100_95 = arg0;
		this.anInt4562 = arg2;
		Static93.method1550(this.anInt4562, this);
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)I")
	public int method3541() {
		if (this.aBoolean207) {
			return 100;
		} else if (super.anObjectArray33 == null) {
			@Pc(24) int local24 = Static63.method1100(this.anInt4562, 255);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)I")
	@Override
	protected int method3512(@OriginalArg(0) int arg0) {
		if (!this.method3531(arg0)) {
			return 0;
		} else if (super.anObjectArray33[arg0] == null) {
			return this.aBooleanArray26[arg0] ? 100 : Static63.method1100(arg0, this.anInt4562);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIZ[B)V")
	public void method3544(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (!arg2) {
			arg3[arg3.length - 2] = (byte) (super.anIntArray339[arg1] >> 8);
			arg3[arg3.length - 1] = (byte) super.anIntArray339[arg1];
			if (this.aClass100_95 != null) {
				Static207.method3437(this.aClass100_95, arg3, arg1);
				this.aBooleanArray26[arg1] = true;
			}
			if (arg0) {
				super.anObjectArray33[arg1] = Static6.method99(arg3);
			}
		} else if (this.aBoolean207) {
			throw new RuntimeException();
		} else {
			if (this.aClass100_94 != null) {
				Static207.method3437(this.aClass100_94, arg3, this.anInt4562);
			}
			this.method3540(arg3);
			this.method3545();
		}
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V")
	private void method3545() {
		this.aBooleanArray26 = new boolean[super.anObjectArray33.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray26.length; local13++) {
			this.aBooleanArray26[local13] = false;
		}
		if (this.aClass100_95 == null) {
			this.aBoolean207 = true;
			return;
		}
		this.anInt4560 = -1;
		for (@Pc(42) int local42 = 0; local42 < this.aBooleanArray26.length; local42++) {
			if (super.anIntArray337[local42] > 0) {
				Static226.method3704(this, this.aClass100_95, local42);
				this.anInt4560 = local42;
			}
		}
		if (this.anInt4560 == -1) {
			this.aBoolean207 = true;
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(II)V")
	@Override
	protected void method3537(@OriginalArg(0) int arg0) {
		if (this.method3531(arg0)) {
			Static185.method3107(this.anInt4562, arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(III)V")
	public void method3547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4566 = arg0;
		this.anInt4557 = arg1;
		if (this.aClass100_94 == null) {
			Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
		} else {
			Static217.method3599(this.anInt4562, this, this.aClass100_94);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method3517(@OriginalArg(0) int arg0) {
		if (!this.method3531(arg0)) {
			return;
		}
		if (this.aClass100_95 == null || this.aBooleanArray26 == null || !this.aBooleanArray26[arg0]) {
			Static203.method3260(true, arg0, (byte) 2, this, this.anInt4562, super.anIntArray338[arg0]);
		} else {
			Static217.method3599(arg0, this, this.aClass100_95);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BIILclient!s;Z)V")
	public void method3549(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(46) int local46;
		if (arg2 != this.aClass100_94) {
			if (!arg3 && this.anInt4560 == arg1) {
				this.aBoolean207 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray26[arg1] = false;
				if (this.aBoolean206 || arg3) {
					Static203.method3260(arg3, arg1, (byte) 2, this, this.anInt4562, super.anIntArray338[arg1]);
				}
			} else {
				Static105.aCRC32_2.reset();
				Static105.aCRC32_2.update(arg0, 0, arg0.length - 2);
				local46 = (int) Static105.aCRC32_2.getValue();
				@Pc(220) int local220 = (arg0[arg0.length - 1] & 0xFF) + ((arg0[arg0.length - 2] & 0xFF) << 8);
				if (local46 == super.anIntArray338[arg1] && local220 == super.anIntArray339[arg1]) {
					this.aBooleanArray26[arg1] = true;
					if (arg3) {
						super.anObjectArray33[arg1] = Static6.method99(arg0);
					}
				} else {
					this.aBooleanArray26[arg1] = false;
					if (this.aBoolean206 || arg3) {
						Static203.method3260(arg3, arg1, (byte) 2, this, this.anInt4562, super.anIntArray338[arg1]);
					}
				}
			}
		} else if (this.aBoolean207) {
			throw new RuntimeException();
		} else if (arg0 == null) {
			Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
		} else {
			Static105.aCRC32_2.reset();
			Static105.aCRC32_2.update(arg0, 0, arg0.length);
			local46 = (int) Static105.aCRC32_2.getValue();
			if (this.anInt4557 == local46) {
				@Pc(72) Class1_Sub16 local72;
				try {
					local72 = new Class1_Sub16(Static108.method1838(arg0));
				} catch (@Pc(74) RuntimeException local74) {
					Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
					return;
				}
				@Pc(89) int local89 = local72.method3793();
				if (local89 == 5 || local89 == 6) {
					@Pc(110) int local110 = 0;
					if (local89 >= 6) {
						local110 = local72.method3784();
					}
					if (local110 == this.anInt4566) {
						this.method3540(arg0);
						this.method3545();
					} else {
						Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
					}
				} else {
					Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
				}
			} else {
				Static203.method3260(true, this.anInt4562, (byte) 0, this, 255, this.anInt4557);
			}
		}
	}
}
