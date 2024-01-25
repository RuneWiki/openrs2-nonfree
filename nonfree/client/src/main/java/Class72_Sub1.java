import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!f;")
	private Class10 aClass10_19;

	@OriginalMember(owner = "client!dl", name = "r", descriptor = "Lclient!f;")
	private Class10 aClass10_20;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "Lclient!f;")
	protected Class10 aClass10_21;

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "Lclient!f;")
	private Class10 aClass10_22;

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!f;")
	private Class10 aClass10_23;

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "Lclient!f;")
	private Class10 aClass10_24;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;Lclient!jp;)V")
	public Class72_Sub1(@OriginalArg(0) Class111 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class175_Sub1 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V")
	protected void method5062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass10_21.method7681(arg0, arg2, arg1, arg3);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
	@Override
	public final boolean method6805() {
		if (!super.method6805()) {
			return false;
		}
		@Pc(13) Class175_Sub1 local13 = (Class175_Sub1) super.aClass175_5;
		if (!super.aClass111_80.method2434(local13.anInt9482)) {
			return false;
		} else if (!super.aClass111_80.method2434(local13.anInt9485)) {
			return false;
		} else if (!super.aClass111_80.method2434(local13.anInt9484)) {
			return false;
		} else if (!super.aClass111_80.method2434(local13.anInt9478)) {
			return false;
		} else if (super.aClass111_80.method2434(local13.anInt9486)) {
			return super.aClass111_80.method2434(local13.anInt9481);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BZII)V")
	@Override
	protected final void method5060(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(15) int local15 = this.aClass10_23.A() + arg1;
		@Pc(26) int local26 = super.aClass175_5.anInt9468 + arg1 - this.aClass10_24.A();
		@Pc(32) int local32 = this.aClass10_22.ca() + arg0;
		@Pc(42) int local42 = super.aClass175_5.anInt9476 + arg0 - this.aClass10_19.ca();
		@Pc(47) int local47 = local26 - local15;
		@Pc(52) int local52 = local42 - local32;
		@Pc(60) int local60 = this.method5059() * local47 / 10000;
		@Pc(63) int[] local63 = new int[4];
		Static136.aClass12_8.oa(local63);
		Static136.aClass12_8.da(local15, local32, local15 + local60, local42);
		this.method5062(local15, local47, local32, local52);
		Static136.aClass12_8.da(local60 + local15, local32, local26, local42);
		this.aClass10_20.method7681(local15, local32, local47, local52);
		Static136.aClass12_8.da(local63[0], local63[1], local63[2], local63[3]);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public final void method6804() {
		super.method6804();
		@Pc(10) Class175_Sub1 local10 = (Class175_Sub1) super.aClass175_5;
		this.aClass10_21 = Static543.method7365(super.aClass111_80, local10.anInt9482);
		this.aClass10_20 = Static543.method7365(super.aClass111_80, local10.anInt9485);
		this.aClass10_23 = Static543.method7365(super.aClass111_80, local10.anInt9484);
		this.aClass10_24 = Static543.method7365(super.aClass111_80, local10.anInt9478);
		this.aClass10_22 = Static543.method7365(super.aClass111_80, local10.anInt9486);
		this.aClass10_19 = Static543.method7365(super.aClass111_80, local10.anInt9481);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIBI)V")
	@Override
	protected final void method5061(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		Static136.aClass12_8.oa(local8);
		Static136.aClass12_8.da(arg0, arg1, arg0 + super.aClass175_5.anInt9468, super.aClass175_5.anInt9476 + arg1);
		@Pc(30) int local30 = this.aClass10_23.A();
		@Pc(34) int local34 = this.aClass10_23.ca();
		@Pc(38) int local38 = this.aClass10_24.A();
		@Pc(42) int local42 = this.aClass10_24.ca();
		this.aClass10_23.method7679(arg0, (super.aClass175_5.anInt9476 - local34) / 2 + arg1);
		this.aClass10_24.method7679(super.aClass175_5.anInt9468 + arg0 - local38, (super.aClass175_5.anInt9476 - local42) / 2 + arg1);
		Static136.aClass12_8.da(arg0, arg1, super.aClass175_5.anInt9468 + arg0, this.aClass10_22.ca() + arg1);
		this.aClass10_22.method7681(local30 + arg0, arg1, super.aClass175_5.anInt9468 - local38 - local30, super.aClass175_5.anInt9476);
		@Pc(112) int local112 = this.aClass10_19.ca();
		Static136.aClass12_8.da(arg0, arg1 + super.aClass175_5.anInt9476 - local112, arg0 - -super.aClass175_5.anInt9468, super.aClass175_5.anInt9476 + arg1);
		this.aClass10_19.method7681(arg0 + local30, -local112 + arg1 - -super.aClass175_5.anInt9476, super.aClass175_5.anInt9468 - local38 - local30, super.aClass175_5.anInt9476);
		Static136.aClass12_8.da(local8[0], local8[1], local8[2], local8[3]);
	}
}
