import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public class Class120_Sub1 extends Class120 {

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Lclient!tf;")
	private Class17 aClass17_38;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!tf;")
	private Class17 aClass17_39;

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "Lclient!tf;")
	protected Class17 aClass17_40;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "Lclient!tf;")
	private Class17 aClass17_41;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "Lclient!tf;")
	private Class17 aClass17_42;

	@OriginalMember(owner = "client!fn", name = "B", descriptor = "Lclient!tf;")
	private Class17 aClass17_43;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!bt;Lclient!bt;Lclient!in;)V")
	public Class120_Sub1(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class103_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method8642(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = arg0 + this.aClass17_41.method5256();
		@Pc(19) int local19 = super.aClass103_5.anInt8646 + arg0 - this.aClass17_39.method5256();
		@Pc(26) int local26 = arg1 + this.aClass17_43.method5251();
		@Pc(37) int local37 = super.aClass103_5.anInt8653 + arg1 - this.aClass17_42.method5251();
		@Pc(42) int local42 = local19 - local9;
		@Pc(47) int local47 = local37 - local26;
		@Pc(55) int local55 = local42 * this.method8641() / 10000;
		@Pc(58) int[] local58 = new int[4];
		Static582.aClass33_13.K(local58);
		Static582.aClass33_13.KA(local9, local26, local55 + local9, local37);
		this.method4117(local42, local47, local26, local9);
		Static582.aClass33_13.KA(local9 + local55, local26, local19, local37);
		this.aClass17_38.method5261(local9, local26, local42, local47);
		Static582.aClass33_13.KA(local58[0], local58[1], local58[2], local58[3]);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
	@Override
	public final void method8638() {
		super.method8638();
		@Pc(10) Class103_Sub2 local10 = (Class103_Sub2) super.aClass103_5;
		this.aClass17_40 = Static203.method3069(local10.anInt8161, super.aClass34_131);
		this.aClass17_38 = Static203.method3069(local10.anInt8165, super.aClass34_131);
		this.aClass17_41 = Static203.method3069(local10.anInt8167, super.aClass34_131);
		this.aClass17_39 = Static203.method3069(local10.anInt8166, super.aClass34_131);
		this.aClass17_43 = Static203.method3069(local10.anInt8162, super.aClass34_131);
		this.aClass17_42 = Static203.method3069(local10.anInt8160, super.aClass34_131);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8636() {
		if (!super.method8636()) {
			return false;
		}
		@Pc(13) Class103_Sub2 local13 = (Class103_Sub2) super.aClass103_5;
		if (!super.aClass34_131.method1235(local13.anInt8161)) {
			return false;
		} else if (!super.aClass34_131.method1235(local13.anInt8165)) {
			return false;
		} else if (!super.aClass34_131.method1235(local13.anInt8167)) {
			return false;
		} else if (!super.aClass34_131.method1235(local13.anInt8166)) {
			return false;
		} else if (super.aClass34_131.method1235(local13.anInt8162)) {
			return super.aClass34_131.method1235(local13.anInt8160);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
	protected void method4117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass17_40.method5261(arg3, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZIB)V")
	@Override
	protected final void method8643(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static582.aClass33_13.K(local8);
		Static582.aClass33_13.KA(arg0, arg1, arg0 + super.aClass103_5.anInt8646, arg1 - -super.aClass103_5.anInt8653);
		@Pc(30) int local30 = this.aClass17_41.method5256();
		@Pc(34) int local34 = this.aClass17_41.method5251();
		@Pc(38) int local38 = this.aClass17_39.method5256();
		@Pc(42) int local42 = this.aClass17_39.method5251();
		this.aClass17_41.method5246(arg0, arg1 + (super.aClass103_5.anInt8653 - local34) / 2);
		this.aClass17_39.method5246(arg0 + super.aClass103_5.anInt8646 - local38, arg1 + (-local42 + super.aClass103_5.anInt8653) / 2);
		Static582.aClass33_13.KA(arg0, arg1, super.aClass103_5.anInt8646 + arg0, this.aClass17_43.method5251() + arg1);
		this.aClass17_43.method5261(local30 + arg0, arg1, super.aClass103_5.anInt8646 - local30 - local38, super.aClass103_5.anInt8653);
		@Pc(112) int local112 = this.aClass17_42.method5251();
		Static582.aClass33_13.KA(arg0, arg1 + super.aClass103_5.anInt8653 - local112, super.aClass103_5.anInt8646 + arg0, super.aClass103_5.anInt8653 + arg1);
		this.aClass17_42.method5261(local30 + arg0, arg1 + super.aClass103_5.anInt8653 - local112, super.aClass103_5.anInt8646 - local30 - local38, super.aClass103_5.anInt8653);
		Static582.aClass33_13.KA(local8[0], local8[1], local8[2], local8[3]);
	}
}
