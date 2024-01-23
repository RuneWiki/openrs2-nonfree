import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!dg", name = "rb", descriptor = "I")
	private int anInt943;

	@OriginalMember(owner = "client!dg", name = "vb", descriptor = "I")
	private int anInt945;

	@OriginalMember(owner = "client!dg", name = "zb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray6;

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
	private int anInt935 = -1;

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!dg", name = "pb", descriptor = "Z")
	private volatile boolean aBoolean89 = false;

	@OriginalMember(owner = "client!dg", name = "tb", descriptor = "Lclient!lg;")
	private Class73 aClass73_2;

	@OriginalMember(owner = "client!dg", name = "xb", descriptor = "Lclient!lg;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
	private int anInt933;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!lg;Lclient!lg;IZZZ)V")
	public Class28_Sub1(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aClass73_2 = arg1;
		this.aClass73_3 = arg0;
		this.anInt933 = arg2;
		this.aBoolean88 = arg5;
		Static157.method2537(this, this.anInt933);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)V")
	public void method850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt943 = arg1;
		this.anInt945 = arg0;
		if (this.aClass73_2 == null) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
		} else {
			Static117.method2014(this.aClass73_2, this, this.anInt933);
		}
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(II)V")
	@Override
	protected void method849(@OriginalArg(1) int arg0) {
		if (!this.method838(arg0)) {
			return;
		}
		if (this.aClass73_3 == null || this.aBooleanArray6 == null || !this.aBooleanArray6[arg0]) {
			Static160.method2584(true, arg0, super.anIntArray97[arg0], this.anInt933, this, (byte) 2);
		} else {
			Static117.method2014(this.aClass73_3, this, arg0);
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)I")
	public int method852() {
		if (this.aBoolean89) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(24) int local24 = Static214.method3464(this.anInt933, 255);
			if (local24 >= 100) {
				local24 = 99;
			}
			return local24;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)V")
	@Override
	protected void method829(@OriginalArg(1) int arg0) {
		if (this.method838(arg0)) {
			Static147.method2402(arg0, this.anInt933);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[BZIZ)V")
	public void method853(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			arg1[arg1.length - 2] = (byte) (super.anIntArray94[arg0] >> 8);
			arg1[arg1.length - 1] = (byte) super.anIntArray94[arg0];
			if (this.aClass73_3 != null) {
				Static133.method2215(this.aClass73_3, arg1, arg0);
				this.aBooleanArray6[arg0] = true;
			}
			if (arg2) {
				super.anObjectArray2[arg0] = Static85.method1440(arg1);
			}
		} else if (this.aBoolean89) {
			throw new RuntimeException();
		} else {
			if (this.aClass73_2 != null) {
				Static133.method2215(this.aClass73_2, arg1, this.anInt933);
			}
			this.method846(arg1);
			this.method855();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!lg;IIZ[B)V")
	public void method854(@OriginalArg(0) Class73 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		@Pc(59) int local59;
		if (arg0 != this.aClass73_2) {
			if (!arg2 && this.anInt935 == arg1) {
				this.aBoolean89 = true;
			}
			if (arg3 == null || arg3.length <= 2) {
				this.aBooleanArray6[arg1] = false;
				if (this.aBoolean88 || arg2) {
					Static160.method2584(arg2, arg1, super.anIntArray97[arg1], this.anInt933, this, (byte) 2);
				}
				return;
			}
			Static104.aCRC32_4.reset();
			Static104.aCRC32_4.update(arg3, 0, arg3.length - 2);
			local59 = (int) Static104.aCRC32_4.getValue();
			@Pc(79) int local79 = ((arg3[arg3.length - 2] & 0xFF) << 8) + (arg3[arg3.length - 1] & 0xFF);
			if (super.anIntArray97[arg1] != local59 || super.anIntArray94[arg1] != local79) {
				this.aBooleanArray6[arg1] = false;
				if (this.aBoolean88 || arg2) {
					Static160.method2584(arg2, arg1, super.anIntArray97[arg1], this.anInt933, this, (byte) 2);
				}
				return;
			}
			this.aBooleanArray6[arg1] = true;
			if (arg2) {
				super.anObjectArray2[arg1] = Static85.method1440(arg3);
			}
			return;
		}
		if (this.aBoolean89) {
			throw new RuntimeException();
		}
		if (arg3 == null) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
			return;
		}
		Static104.aCRC32_4.reset();
		Static104.aCRC32_4.update(arg3, 0, arg3.length);
		local59 = (int) Static104.aCRC32_4.getValue();
		if (local59 != this.anInt945) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
			return;
		}
		@Pc(195) Class1_Sub26 local195;
		try {
			local195 = new Class1_Sub26(Static23.method418(arg3));
		} catch (@Pc(197) RuntimeException local197) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
			return;
		}
		@Pc(212) int local212 = local195.method2945();
		if (local212 != 5 && local212 != 6) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
			return;
		}
		@Pc(235) int local235 = 0;
		if (local212 >= 6) {
			local235 = local195.method2958();
		}
		if (local235 != this.anInt943) {
			Static160.method2584(true, this.anInt933, this.anInt945, 255, this, (byte) 0);
			return;
		}
		this.method846(arg3);
		this.method855();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	private void method855() {
		this.aBooleanArray6 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray6.length; local13++) {
			this.aBooleanArray6[local13] = false;
		}
		if (this.aClass73_3 == null) {
			this.aBoolean89 = true;
			return;
		}
		this.anInt935 = -1;
		for (@Pc(44) int local44 = 0; local44 < this.aBooleanArray6.length; local44++) {
			if (super.anIntArray98[local44] > 0) {
				Static54.method1092(local44, this, this.aClass73_3);
				this.anInt935 = local44;
			}
		}
		if (this.anInt935 == -1) {
			this.aBoolean89 = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
	@Override
	protected int method822(@OriginalArg(1) int arg0) {
		if (!this.method838(arg0)) {
			return 0;
		} else if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray6[arg0] ? 100 : Static214.method3464(arg0, this.anInt933);
		} else {
			return 100;
		}
	}
}
