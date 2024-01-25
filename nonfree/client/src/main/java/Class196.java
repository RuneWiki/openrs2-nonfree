import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class196 {

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
	public int anInt5475;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!co;")
	private final Class41 aClass41_66 = new Class41(64);

	@OriginalMember(owner = "client!qr", name = "v", descriptor = "Lclient!co;")
	public final Class41 aClass41_67 = new Class41(50);

	@OriginalMember(owner = "client!qr", name = "w", descriptor = "Lclient!uk;")
	public final Class230 aClass230_1 = new Class230(250);

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "Lclient!wr;")
	private final Class251 aClass251_1 = new Class251();

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public final int anInt5472;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "Lclient!g;")
	public final Class83 aClass83_105;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "Lclient!fn;")
	private final Class79 aClass79_2;

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!g;")
	private final Class83 aClass83_106;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
	public final int anInt5461;

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray31;

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	static {
		for (@Pc(10) int local10 = 0; local10 < 100; local10++) {
			aRectangleArray1[local10] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!ci;IZLclient!fn;Lclient!g;Lclient!g;)V")
	public Class196(@OriginalArg(0) Class38 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class79 arg3, @OriginalArg(4) Class83 arg4, @OriginalArg(5) Class83 arg5) {
		this.anInt5472 = arg1;
		this.aClass83_105 = arg5;
		this.aClass79_2 = arg3;
		this.aBoolean400 = arg2;
		this.aClass83_106 = arg4;
		if (this.aClass83_106 == null) {
			this.anInt5461 = 0;
		} else {
			@Pc(49) int local49 = this.aClass83_106.method1956() - 1;
			this.anInt5461 = local49 * 256 + this.aClass83_106.method1955(local49);
		}
		this.aStringArray31 = new String[] { null, null, Static221.aClass62_235.method1389(this.anInt5472), null, null };
		this.aStringArray30 = new String[] { null, null, null, null, Static117.aClass62_86.method1389(this.anInt5472) };
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method4817() {
		@Pc(2) Class41 local2 = this.aClass41_66;
		synchronized (this.aClass41_66) {
			this.aClass41_66.method829();
		}
		local2 = this.aClass41_67;
		synchronized (this.aClass41_67) {
			this.aClass41_67.method829();
		}
		@Pc(38) Class230 local38 = this.aClass230_1;
		synchronized (this.aClass230_1) {
			this.aClass230_1.method5605();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
	public void method4818(@OriginalArg(1) int arg0) {
		this.anInt5475 = arg0;
		@Pc(21) Class41 local21 = this.aClass41_67;
		synchronized (this.aClass41_67) {
			this.aClass41_67.method825();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZLclient!nd;ZILclient!oj;Lclient!oj;IILclient!cr;III)Lclient!rg;")
	public Class27 method4820(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class48 arg4, @OriginalArg(5) Class48 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class44 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(16) Class27 local16 = this.method4821(arg7, arg3, arg10, arg1, arg6, arg4, arg9);
		if (local16 != null) {
			return local16;
		}
		@Pc(39) Class152 local39 = this.method4827(arg3);
		if (arg7 > 1 && local39.anIntArray313 != null) {
			@Pc(49) int local49 = -1;
			for (@Pc(51) int local51 = 0; local51 < 10; local51++) {
				if (local39.lb[local51] <= arg7 && local39.lb[local51] != 0) {
					local49 = local39.anIntArray313[local51];
				}
			}
			if (local49 != -1) {
				local39 = this.method4827(local49);
			}
		}
		@Pc(96) int[] local96 = local39.method3840(arg5, arg6, arg9, arg10, arg1, arg7, arg0, arg8, arg4);
		if (local96 == null) {
			return null;
		}
		@Pc(110) Class27 local110;
		if (arg2) {
			local110 = arg5.method2456(local96, 36, 36, 32);
		} else {
			local110 = arg4.method2456(local96, 36, 36, 32);
		}
		if (!arg2) {
			@Pc(126) Class251 local126 = new Class251();
			local126.anInt7099 = arg10;
			local126.anInt7104 = arg6;
			local126.anInt7096 = arg3;
			local126.anInt7098 = arg7;
			local126.anInt7100 = arg9;
			local126.anInt7097 = arg4.anInt3038;
			local126.aBoolean508 = arg1 != null;
			this.aClass230_1.method5607(local110, local126);
		}
		return local110;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIILclient!nd;ILclient!oj;I)Lclient!rg;")
	public Class27 method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class158 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) int arg6) {
		this.aClass251_1.anInt7100 = arg6;
		this.aClass251_1.anInt7097 = arg5.anInt3038;
		this.aClass251_1.anInt7098 = arg0;
		this.aClass251_1.anInt7099 = arg2;
		this.aClass251_1.anInt7104 = arg4;
		this.aClass251_1.anInt7096 = arg1;
		this.aClass251_1.aBoolean508 = arg3 != null;
		return (Class27) this.aClass230_1.method5600(this.aClass251_1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
	public void method4822(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean400) {
			this.aBoolean400 = arg0;
			this.method4824();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method4823() {
		@Pc(6) Class230 local6 = this.aClass230_1;
		synchronized (this.aClass230_1) {
			this.aClass230_1.method5602();
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
	public void method4824() {
		@Pc(6) Class41 local6 = this.aClass41_66;
		synchronized (this.aClass41_66) {
			this.aClass41_66.method825();
		}
		local6 = this.aClass41_67;
		synchronized (this.aClass41_67) {
			this.aClass41_67.method825();
		}
		@Pc(42) Class230 local42 = this.aClass230_1;
		synchronized (this.aClass230_1) {
			this.aClass230_1.method5602();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	public void method4825() {
		@Pc(2) Class41 local2 = this.aClass41_67;
		synchronized (this.aClass41_67) {
			this.aClass41_67.method825();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lclient!mm;")
	public Class152 method4827(@OriginalArg(0) int arg0) {
		@Pc(8) Class41 local8 = this.aClass41_66;
		@Pc(18) Class152 local18;
		synchronized (this.aClass41_66) {
			local18 = (Class152) this.aClass41_66.method823((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass83_106.method1968(Static192.method3516(arg0), Static207.method3780(arg0));
		local18 = new Class152();
		local18.aClass196_2 = this;
		local18.anInt4306 = arg0;
		local18.aStringArray23 = new String[] { null, null, Static221.aClass62_235.method1389(this.anInt5472), null, null };
		local18.aStringArray24 = new String[] { null, null, null, null, Static117.aClass62_86.method1389(this.anInt5472) };
		if (local39 != null) {
			local18.method3843(new Class2_Sub24(local39));
		}
		local18.method3850();
		if (local18.anInt4310 != -1) {
			local18.method3832(this.method4827(local18.anInt4310), this.method4827(local18.anInt4340));
		}
		if (local18.anInt4311 != -1) {
			local18.method3848(this.method4827(local18.anInt4311), this.method4827(local18.anInt4337));
		}
		if (!this.aBoolean400 && local18.aBoolean311) {
			local18.aString35 = Static109.aClass62_78.method1389(this.anInt5472);
			local18.anIntArray314 = null;
			local18.aStringArray23 = this.aStringArray31;
			local18.anInt4312 = 0;
			local18.aBoolean312 = false;
			local18.aStringArray24 = this.aStringArray30;
			if (local18.aClass243_15 != null) {
				@Pc(188) boolean local188 = false;
				for (@Pc(193) Class2 local193 = local18.aClass243_15.method5975(); local193 != null; local193 = local18.aClass243_15.method5973()) {
					@Pc(203) Class20 local203 = this.aClass79_2.method1851((int) local193.aLong213);
					if (local203.aBoolean39) {
						local193.method6130();
					} else {
						local188 = true;
					}
				}
				if (!local188) {
					local18.aClass243_15 = null;
				}
			}
		}
		@Pc(230) Class41 local230 = this.aClass41_66;
		synchronized (this.aClass41_66) {
			this.aClass41_66.method832((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)V")
	public void method4828() {
		@Pc(2) Class41 local2 = this.aClass41_66;
		synchronized (this.aClass41_66) {
			this.aClass41_66.method826(5);
		}
		local2 = this.aClass41_67;
		synchronized (this.aClass41_67) {
			this.aClass41_67.method826(5);
		}
		@Pc(38) Class230 local38 = this.aClass230_1;
		synchronized (this.aClass230_1) {
			this.aClass230_1.method5604();
		}
	}
}
