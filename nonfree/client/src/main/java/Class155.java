import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class155 {

	@OriginalMember(owner = "client!mk", name = "C", descriptor = "I")
	public int anInt4499;

	@OriginalMember(owner = "client!mk", name = "l", descriptor = "Lclient!hn;")
	private final Class102 aClass102_30 = new Class102(64);

	@OriginalMember(owner = "client!mk", name = "w", descriptor = "Lclient!hn;")
	public final Class102 aClass102_31 = new Class102(50);

	@OriginalMember(owner = "client!mk", name = "x", descriptor = "Lclient!jd;")
	public final Class120 aClass120_1 = new Class120(250);

	@OriginalMember(owner = "client!mk", name = "y", descriptor = "Lclient!cl;")
	private final Class39 aClass39_1 = new Class39();

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!fo;")
	private final Class82 aClass82_57;

	@OriginalMember(owner = "client!mk", name = "z", descriptor = "Lclient!fv;")
	private final Class86 aClass86_2;

	@OriginalMember(owner = "client!mk", name = "v", descriptor = "Lclient!fo;")
	public final Class82 aClass82_58;

	@OriginalMember(owner = "client!mk", name = "r", descriptor = "Z")
	private boolean aBoolean515;

	@OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
	public final int anInt4490;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
	public final int anInt4483;

	@OriginalMember(owner = "client!mk", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray23;

	@OriginalMember(owner = "client!mk", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray24;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!d;IZLclient!fv;Lclient!fo;Lclient!fo;)V")
	public Class155(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) Class82 arg5) {
		this.aClass82_57 = arg4;
		this.aClass86_2 = arg3;
		this.aClass82_58 = arg5;
		this.aBoolean515 = arg2;
		this.anInt4490 = arg1;
		if (this.aClass82_57 == null) {
			this.anInt4483 = 0;
		} else {
			@Pc(54) int local54 = this.aClass82_57.method1825() - 1;
			this.anInt4483 = local54 * 256 + this.aClass82_57.method1823(local54);
		}
		this.aStringArray23 = new String[] { null, null, Static343.aClass119_140.method2673(this.anInt4490), null, null };
		this.aStringArray24 = new String[] { null, null, null, null, Static127.aClass119_71.method2673(this.anInt4490) };
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V")
	public void method3536(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean515) {
			this.aBoolean515 = arg0;
			this.method3538();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
	public void method3538() {
		@Pc(6) Class102 local6 = this.aClass102_30;
		synchronized (this.aClass102_30) {
			this.aClass102_30.method2271();
		}
		local6 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2271();
		}
		@Pc(36) Class120 local36 = this.aClass120_1;
		synchronized (this.aClass120_1) {
			this.aClass120_1.method2676();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!za;Lclient!oe;IZIIIIILclient!za;ZLclient!la;)Lclient!o;")
	public Class6 method3539(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class173 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class34 arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class76 arg10) {
		@Pc(16) Class6 local16 = this.method3550(arg1, arg6, arg7, arg2, arg5, arg0, arg4);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class162 local25 = this.method3548(arg2);
		if (arg5 > 1 && local25.anIntArray302 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (arg5 >= local25.anIntArray300[local37] && local25.anIntArray300[local37] != 0) {
					local35 = local25.anIntArray302[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method3548(local35);
			}
		}
		@Pc(90) int[] local90 = local25.method3709(arg5, arg6, arg4, arg8, arg0, arg1, arg9, arg10, arg7);
		if (local90 == null) {
			return null;
		}
		@Pc(110) Class6 local110;
		if (arg3) {
			local110 = arg8.method5798(local90, 36, 36, 32);
		} else {
			local110 = arg0.method5798(local90, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(126) Class39 local126 = new Class39();
			local126.anInt969 = arg5;
			local126.anInt971 = arg6;
			local126.aBoolean107 = arg1 != null;
			local126.anInt967 = arg7;
			local126.anInt968 = arg0.anInt7333;
			local126.anInt964 = arg4;
			local126.anInt966 = arg2;
			this.aClass120_1.method2675(local126, local110);
		}
		return local110;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
	public void method3541() {
		@Pc(6) Class102 local6 = this.aClass102_30;
		synchronized (this.aClass102_30) {
			this.aClass102_30.method2260();
		}
		local6 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2260();
		}
		@Pc(36) Class120 local36 = this.aClass120_1;
		synchronized (this.aClass120_1) {
			this.aClass120_1.method2681();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
	public void method3542() {
		@Pc(2) Class102 local2 = this.aClass102_30;
		synchronized (this.aClass102_30) {
			this.aClass102_30.method2262(5);
		}
		local2 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2262(5);
		}
		@Pc(44) Class120 local44 = this.aClass120_1;
		synchronized (this.aClass120_1) {
			this.aClass120_1.method2683();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
	public void method3543(@OriginalArg(1) int arg0) {
		this.anInt4499 = arg0;
		@Pc(9) Class102 local9 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2271();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
	public void method3544() {
		@Pc(2) Class120 local2 = this.aClass120_1;
		synchronized (this.aClass120_1) {
			this.aClass120_1.method2676();
		}
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	public void method3546() {
		@Pc(6) Class102 local6 = this.aClass102_31;
		synchronized (this.aClass102_31) {
			this.aClass102_31.method2271();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Lclient!nb;")
	public Class162 method3548(@OriginalArg(1) int arg0) {
		@Pc(15) Class102 local15 = this.aClass102_30;
		@Pc(25) Class162 local25;
		synchronized (this.aClass102_30) {
			local25 = (Class162) this.aClass102_30.method2258((long) arg0);
		}
		if (local25 != null) {
			return local25;
		}
		@Pc(38) Class82 local38 = this.aClass82_57;
		@Pc(53) byte[] local53;
		synchronized (this.aClass82_57) {
			local53 = this.aClass82_57.method1817(Static216.method3150(arg0), Static160.method2324(arg0));
		}
		local25 = new Class162();
		local25.aClass155_1 = this;
		local25.anInt4694 = arg0;
		local25.aStringArray27 = new String[] { null, null, Static343.aClass119_140.method2673(this.anInt4490), null, null };
		local25.aStringArray26 = new String[] { null, null, null, null, Static127.aClass119_71.method2673(this.anInt4490) };
		if (local53 != null) {
			local25.method3697(new Class1_Sub28(local53));
		}
		local25.method3692();
		if (local25.anInt4711 != -1) {
			local25.method3694(this.method3548(local25.lb), this.method3548(local25.anInt4711));
		}
		if (local25.anInt4702 != -1) {
			local25.method3706(this.method3548(local25.anInt4702), this.method3548(local25.anInt4755));
		}
		if (!this.aBoolean515 && local25.aBoolean536) {
			local25.aString55 = Static223.aClass119_137.method2673(this.anInt4490);
			local25.aStringArray26 = this.aStringArray24;
			local25.aStringArray27 = this.aStringArray23;
			local25.anInt4720 = 0;
			local25.anIntArray301 = null;
			local25.aBoolean535 = false;
			if (local25.aClass199_131 != null) {
				@Pc(207) boolean local207 = false;
				for (@Pc(212) Class1 local212 = local25.aClass199_131.method4392(); local212 != null; local212 = local25.aClass199_131.method4393()) {
					@Pc(222) Class106 local222 = this.aClass86_2.method1919((int) local212.aLong230);
					if (local222.aBoolean311) {
						local212.method5915();
					} else {
						local207 = true;
					}
				}
				if (!local207) {
					local25.aClass199_131 = null;
				}
			}
		}
		@Pc(247) Class102 local247 = this.aClass102_30;
		synchronized (this.aClass102_30) {
			this.aClass102_30.method2272((long) arg0, local25);
			return local25;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!oe;IIIIILclient!za;I)Lclient!o;")
	public Class6 method3550(@OriginalArg(0) Class173 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6) {
		this.aClass39_1.anInt971 = arg1;
		this.aClass39_1.anInt968 = arg5.anInt7333;
		this.aClass39_1.anInt966 = arg3;
		this.aClass39_1.anInt964 = arg6;
		this.aClass39_1.aBoolean107 = arg0 != null;
		this.aClass39_1.anInt969 = arg4;
		this.aClass39_1.anInt967 = arg2;
		return (Class6) this.aClass120_1.method2677(this.aClass39_1);
	}
}
