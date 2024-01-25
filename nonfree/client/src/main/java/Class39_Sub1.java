import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!ac;")
	protected Class5 aClass5_16;

	@OriginalMember(owner = "client!re", name = "u", descriptor = "Lclient!ac;")
	private Class5 aClass5_17;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Lclient!ac;")
	private Class5 aClass5_18;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!ac;")
	private Class5 aClass5_19;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "Lclient!ac;")
	private Class5 aClass5_20;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "Lclient!ac;")
	private Class5 aClass5_21;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!cda;)V")
	public Class39_Sub1(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class41_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z")
	@Override
	public final boolean method8344() {
		if (!super.method8344()) {
			return false;
		}
		@Pc(13) Class41_Sub1 local13 = (Class41_Sub1) super.aClass41_5;
		if (!super.aClass181_130.method5040(local13.anInt9786)) {
			return false;
		} else if (!super.aClass181_130.method5040(local13.anInt9783)) {
			return false;
		} else if (!super.aClass181_130.method5040(local13.anInt9782)) {
			return false;
		} else if (!super.aClass181_130.method5040(local13.anInt9787)) {
			return false;
		} else if (super.aClass181_130.method5040(local13.anInt9784)) {
			return super.aClass181_130.method5040(local13.anInt9785);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected final void method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 + this.aClass5_17.method7589();
		@Pc(21) int local21 = super.aClass41_5.anInt9779 + arg0 - this.aClass5_18.method7589();
		@Pc(27) int local27 = this.aClass5_19.method7585() + arg1;
		@Pc(38) int local38 = arg1 + super.aClass41_5.anInt9773 - this.aClass5_21.method7585();
		@Pc(43) int local43 = local21 - local10;
		@Pc(48) int local48 = local38 - local27;
		@Pc(56) int local56 = local43 * this.method8348() / 10000;
		@Pc(59) int[] local59 = new int[4];
		Static47.aClass33_3.K(local59);
		Static47.aClass33_3.KA(local10, local27, local56 + local10, local38);
		this.method2824(local10, local48, local43, local27);
		Static47.aClass33_3.KA(local10 + local56, local27, local21, local38);
		this.aClass5_20.method7598(local10, local27, local43, local48);
		Static47.aClass33_3.KA(local59[0], local59[1], local59[2], local59[3]);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected final void method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static47.aClass33_3.K(local8);
		Static47.aClass33_3.KA(arg1, arg0, arg1 + super.aClass41_5.anInt9779, arg0 - -super.aClass41_5.anInt9773);
		@Pc(30) int local30 = this.aClass5_17.method7589();
		@Pc(34) int local34 = this.aClass5_17.method7585();
		@Pc(38) int local38 = this.aClass5_18.method7589();
		@Pc(42) int local42 = this.aClass5_18.method7585();
		this.aClass5_17.method7577(arg1, arg0 + (super.aClass41_5.anInt9773 - local34) / 2);
		this.aClass5_18.method7577(arg1 + super.aClass41_5.anInt9779 - local38, arg0 - -((super.aClass41_5.anInt9773 - local42) / 2));
		Static47.aClass33_3.KA(arg1, arg0, arg1 + super.aClass41_5.anInt9779, arg0 + this.aClass5_19.method7585());
		this.aClass5_19.method7598(local30 + arg1, arg0, super.aClass41_5.anInt9779 - local30 - local38, super.aClass41_5.anInt9773);
		@Pc(115) int local115 = this.aClass5_21.method7585();
		Static47.aClass33_3.KA(arg1, super.aClass41_5.anInt9773 + arg0 - local115, arg1 + super.aClass41_5.anInt9779, super.aClass41_5.anInt9773 + arg0);
		this.aClass5_21.method7598(local30 + arg1, arg0 + (super.aClass41_5.anInt9773 - local115), super.aClass41_5.anInt9779 - local30 - local38, super.aClass41_5.anInt9773);
		Static47.aClass33_3.KA(local8[0], local8[1], local8[2], local8[3]);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIII)V")
	protected void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		this.aClass5_16.method7598(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
	@Override
	public final void method8346() {
		super.method8346();
		@Pc(10) Class41_Sub1 local10 = (Class41_Sub1) super.aClass41_5;
		this.aClass5_16 = Static336.method3828(super.aClass181_130, local10.anInt9786);
		this.aClass5_20 = Static336.method3828(super.aClass181_130, local10.anInt9783);
		this.aClass5_17 = Static336.method3828(super.aClass181_130, local10.anInt9782);
		this.aClass5_18 = Static336.method3828(super.aClass181_130, local10.anInt9787);
		this.aClass5_19 = Static336.method3828(super.aClass181_130, local10.anInt9784);
		this.aClass5_21 = Static336.method3828(super.aClass181_130, local10.anInt9785);
	}
}
