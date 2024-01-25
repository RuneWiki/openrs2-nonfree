import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jka")
public class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!jka", name = "A", descriptor = "Lclient!ug;")
	private Class43 aClass43_10;

	@OriginalMember(owner = "client!jka", name = "w", descriptor = "Lclient!ug;")
	protected Class43 aClass43_11;

	@OriginalMember(owner = "client!jka", name = "x", descriptor = "Lclient!ug;")
	private Class43 aClass43_12;

	@OriginalMember(owner = "client!jka", name = "s", descriptor = "Lclient!ug;")
	private Class43 aClass43_13;

	@OriginalMember(owner = "client!jka", name = "F", descriptor = "Lclient!ug;")
	private Class43 aClass43_14;

	@OriginalMember(owner = "client!jka", name = "u", descriptor = "Lclient!ug;")
	private Class43 aClass43_15;

	@OriginalMember(owner = "client!jka", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;Lclient!ck;)V")
	public Class93_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class33_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IIZII)V")
	protected void method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.aClass43_11.method9605(arg0, arg3, arg1, arg2);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(B)V")
	@Override
	public final void method9561() {
		super.method9561();
		@Pc(10) Class33_Sub2 local10 = (Class33_Sub2) super.aClass33_5;
		this.aClass43_11 = Static551.method6202(super.aClass254_171, local10.anInt7257);
		this.aClass43_12 = Static551.method6202(super.aClass254_171, local10.anInt7262);
		this.aClass43_10 = Static551.method6202(super.aClass254_171, local10.anInt7260);
		this.aClass43_15 = Static551.method6202(super.aClass254_171, local10.anInt7255);
		this.aClass43_14 = Static551.method6202(super.aClass254_171, local10.anInt7258);
		this.aClass43_13 = Static551.method6202(super.aClass254_171, local10.anInt7256);
	}

	@OriginalMember(owner = "client!jka", name = "b", descriptor = "(IZII)V")
	@Override
	protected final void method9568(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(9) int local9 = this.aClass43_10.method9587() + arg0;
		@Pc(19) int local19 = super.aClass33_5.anInt7246 + arg0 - this.aClass43_15.method9587();
		@Pc(25) int local25 = this.aClass43_14.method9600() + arg1;
		@Pc(35) int local35 = super.aClass33_5.anInt7251 + arg1 - this.aClass43_13.method9600();
		@Pc(40) int local40 = local19 - local9;
		@Pc(45) int local45 = local35 - local25;
		@Pc(53) int local53 = this.method9563() * local40 / 10000;
		@Pc(56) int[] local56 = new int[4];
		Static396.aClass145_6.K(local56);
		Static396.aClass145_6.KA(local9, local25, local53 + local9, local35);
		this.method1954(local9, local40, local45, local25);
		Static396.aClass145_6.KA(local53 + local9, local25, local19, local35);
		this.aClass43_12.method9605(local9, local25, local40, local45);
		Static396.aClass145_6.KA(local56[0], local56[1], local56[2], local56[3]);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(IZII)V")
	@Override
	protected final void method9565(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(16) int[] local16 = new int[4];
		Static396.aClass145_6.K(local16);
		Static396.aClass145_6.KA(arg1, arg0, arg1 + super.aClass33_5.anInt7246, super.aClass33_5.anInt7251 + arg0);
		@Pc(37) int local37 = this.aClass43_10.method9587();
		@Pc(41) int local41 = this.aClass43_10.method9600();
		@Pc(45) int local45 = this.aClass43_15.method9587();
		@Pc(49) int local49 = this.aClass43_15.method9600();
		this.aClass43_10.method9588(arg1, (super.aClass33_5.anInt7251 - local41) / 2 + arg0);
		this.aClass43_15.method9588(super.aClass33_5.anInt7246 + arg1 - local45, (super.aClass33_5.anInt7251 - local49) / 2 + arg0);
		Static396.aClass145_6.KA(arg1, arg0, super.aClass33_5.anInt7246 + arg1, this.aClass43_14.method9600() + arg0);
		this.aClass43_14.method9605(arg1 + local37, arg0, super.aClass33_5.anInt7246 - local37 - local45, super.aClass33_5.anInt7251);
		@Pc(118) int local118 = this.aClass43_13.method9600();
		Static396.aClass145_6.KA(arg1, super.aClass33_5.anInt7251 + arg0 - local118, super.aClass33_5.anInt7246 + arg1, arg0 + super.aClass33_5.anInt7251);
		this.aClass43_13.method9605(local37 + arg1, super.aClass33_5.anInt7251 + arg0 + -local118, super.aClass33_5.anInt7246 - local45 - local37, super.aClass33_5.anInt7251);
		Static396.aClass145_6.KA(local16[0], local16[1], local16[2], local16[3]);
	}

	@OriginalMember(owner = "client!jka", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method9562() {
		if (!super.method9562()) {
			return false;
		}
		@Pc(14) Class33_Sub2 local14 = (Class33_Sub2) super.aClass33_5;
		if (!super.aClass254_171.method6072(local14.anInt7257)) {
			return false;
		} else if (!super.aClass254_171.method6072(local14.anInt7262)) {
			return false;
		} else if (!super.aClass254_171.method6072(local14.anInt7260)) {
			return false;
		} else if (!super.aClass254_171.method6072(local14.anInt7255)) {
			return false;
		} else if (super.aClass254_171.method6072(local14.anInt7258)) {
			return super.aClass254_171.method6072(local14.anInt7256);
		} else {
			return false;
		}
	}
}
