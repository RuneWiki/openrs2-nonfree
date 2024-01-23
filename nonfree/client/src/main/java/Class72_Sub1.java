import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!rd", name = "db", descriptor = "[Z")
	private volatile boolean[] aBooleanArray114;

	@OriginalMember(owner = "client!rd", name = "rb", descriptor = "I")
	private int anInt4041;

	@OriginalMember(owner = "client!rd", name = "ub", descriptor = "I")
	private int anInt4044;

	@OriginalMember(owner = "client!rd", name = "hb", descriptor = "Z")
	private volatile boolean aBoolean174 = false;

	@OriginalMember(owner = "client!rd", name = "kb", descriptor = "Z")
	private boolean aBoolean176 = false;

	@OriginalMember(owner = "client!rd", name = "mb", descriptor = "I")
	private int anInt4037 = -1;

	@OriginalMember(owner = "client!rd", name = "eb", descriptor = "I")
	private int anInt4034;

	@OriginalMember(owner = "client!rd", name = "gb", descriptor = "Lclient!t;")
	private Class88 aClass88_2;

	@OriginalMember(owner = "client!rd", name = "ob", descriptor = "Lclient!t;")
	private Class88 aClass88_3;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!t;Lclient!t;IZZZ)V")
	public Class72_Sub1(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class88 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean176 = arg5;
		this.anInt4034 = arg2;
		this.aClass88_2 = arg0;
		this.aClass88_3 = arg1;
		Static26.method343(this.anInt4034, this);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(II)V")
	@Override
	protected void method3181(@OriginalArg(1) int arg0) {
		if (!this.method3188(arg0)) {
			return;
		}
		if (this.aClass88_2 == null || this.aBooleanArray114 == null || !this.aBooleanArray114[arg0]) {
			Static181.method3308(arg0, (byte) 2, this.anInt4034, this, true, super.anIntArray662[arg0]);
		} else {
			Static54.method686(this, this.aClass88_2, arg0);
		}
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(II)I")
	@Override
	protected int method3186(@OriginalArg(1) int arg0) {
		if (!this.method3188(arg0)) {
			return 0;
		} else if (super.anObjectArray33[arg0] == null) {
			return this.aBooleanArray114[arg0] ? 100 : Static87.method1548(arg0, this.anInt4034);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(BII)V")
	public void method3198(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4044 = arg1;
		this.anInt4041 = arg0;
		if (this.aClass88_3 == null) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
		} else {
			Static54.method686(this, this.aClass88_3, this.anInt4034);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI[BIZ)V")
	public void method3199(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (arg0) {
			if (this.aBoolean174) {
				throw new RuntimeException();
			}
			if (this.aClass88_3 != null) {
				Static188.method3481(this.anInt4034, this.aClass88_3, arg1);
			}
			this.method3176(arg1);
			this.method3201();
			return;
		}
		arg1[arg1.length - 2] = (byte) (super.anIntArray661[arg2] >> 8);
		arg1[arg1.length - 1] = (byte) super.anIntArray661[arg2];
		if (this.aClass88_2 != null) {
			Static188.method3481(arg2, this.aClass88_2, arg1);
			this.aBooleanArray114[arg2] = true;
		}
		if (arg3) {
			super.anObjectArray33[arg2] = Static223.method3930(arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
	@Override
	protected void method3168(@OriginalArg(1) int arg0) {
		if (this.method3188(arg0)) {
			Static35.method427(arg0, this.anInt4034);
		}
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
	private void method3201() {
		this.aBooleanArray114 = new boolean[super.anObjectArray33.length];
		for (@Pc(20) int local20 = 0; local20 < this.aBooleanArray114.length; local20++) {
			this.aBooleanArray114[local20] = false;
		}
		if (this.aClass88_2 == null) {
			this.aBoolean174 = true;
			return;
		}
		this.anInt4037 = -1;
		for (@Pc(45) int local45 = 0; local45 < this.aBooleanArray114.length; local45++) {
			if (super.anIntArray659[local45] > 0) {
				Static42.method582(this, local45, this.aClass88_2);
				this.anInt4037 = local45;
			}
		}
		if (this.anInt4037 == -1) {
			this.aBoolean174 = true;
		}
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)I")
	public int method3202() {
		if (this.aBoolean174) {
			return 100;
		} else if (super.anObjectArray33 == null) {
			@Pc(26) int local26 = Static87.method1548(this.anInt4034, 255);
			if (local26 >= 100) {
				local26 = 99;
			}
			return local26;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BLclient!t;ZI)V")
	public void method3203(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class88 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(67) int local67;
		if (this.aClass88_3 != arg1) {
			if (!arg2 && this.anInt4037 == arg3) {
				this.aBoolean174 = true;
			}
			if (arg0 == null || arg0.length <= 2) {
				this.aBooleanArray114[arg3] = false;
				if (this.aBoolean176 || arg2) {
					Static181.method3308(arg3, (byte) 2, this.anInt4034, this, arg2, super.anIntArray662[arg3]);
				}
				return;
			}
			Static89.aCRC32_2.reset();
			Static89.aCRC32_2.update(arg0, 0, arg0.length - 2);
			local67 = (int) Static89.aCRC32_2.getValue();
			@Pc(87) int local87 = ((arg0[arg0.length - 2] & 0xFF) << 8) + (arg0[arg0.length - 1] & 0xFF);
			if (local67 != super.anIntArray662[arg3] || super.anIntArray661[arg3] != local87) {
				this.aBooleanArray114[arg3] = false;
				if (this.aBoolean176 || arg2) {
					Static181.method3308(arg3, (byte) 2, this.anInt4034, this, arg2, super.anIntArray662[arg3]);
				}
				return;
			}
			this.aBooleanArray114[arg3] = true;
			if (arg2) {
				super.anObjectArray33[arg3] = Static223.method3930(arg0);
			}
			return;
		}
		if (this.aBoolean174) {
			throw new RuntimeException();
		}
		if (arg0 == null) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
			return;
		}
		Static89.aCRC32_2.reset();
		Static89.aCRC32_2.update(arg0, 0, arg0.length);
		local67 = (int) Static89.aCRC32_2.getValue();
		if (this.anInt4041 != local67) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
			return;
		}
		@Pc(197) Class2_Sub23 local197;
		try {
			local197 = new Class2_Sub23(Static165.method2999(arg0));
		} catch (@Pc(199) RuntimeException local199) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
			return;
		}
		@Pc(214) int local214 = local197.method2122();
		if (local214 != 5 && local214 != 6) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
			return;
		}
		@Pc(235) int local235 = 0;
		if (local214 >= 6) {
			local235 = local197.method2133();
		}
		if (local235 != this.anInt4044) {
			Static181.method3308(this.anInt4034, (byte) 0, 255, this, true, this.anInt4041);
			return;
		}
		this.method3176(arg0);
		this.method3201();
	}
}
