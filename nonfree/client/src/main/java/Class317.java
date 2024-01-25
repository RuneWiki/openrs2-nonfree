import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class317 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "I")
	private int anInt9303 = 0;

	@OriginalMember(owner = "client!td", name = "p", descriptor = "I")
	private int anInt9311 = 0;

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	private int anInt9302 = 0;

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_40;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!jga;")
	private final Class161 aClass161_5;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[Lclient!cca;")
	private final Class11[] aClass11Array1;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!sh;")
	public final Class11_Sub8 aClass11_Sub8_1;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class317(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_40 = arg0;
		this.aClass161_5 = new Class161(arg0);
		this.aClass11Array1 = new Class11[10];
		this.aClass11Array1[1] = new Class11_Sub6(arg0);
		this.aClass11Array1[2] = new Class11_Sub5(arg0, this.aClass161_5);
		this.aClass11Array1[4] = new Class11_Sub4(arg0, this.aClass161_5);
		this.aClass11Array1[5] = new Class11_Sub1(arg0, this.aClass161_5);
		this.aClass11Array1[6] = new Class11_Sub3(arg0);
		this.aClass11Array1[7] = new Class11_Sub7(arg0);
		this.aClass11Array1[3] = this.aClass11_Sub8_1 = new Class11_Sub8(arg0);
		this.aClass11Array1[8] = new Class11_Sub2(arg0, this.aClass161_5);
		this.aClass11Array1[9] = new Class11_Sub9(arg0, this.aClass161_5);
		if (!this.aClass11Array1[8].method8725()) {
			this.aClass11Array1[8] = this.aClass11Array1[4];
		}
		if (!this.aClass11Array1[9].method8725()) {
			this.aClass11Array1[9] = this.aClass11Array1[8];
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Z")
	public boolean method7917() {
		return this.aClass11Array1[3].method8725();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!me;II)Z")
	public boolean method7918(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9302 == 0) {
			return false;
		} else {
			this.aClass11Array1[Integer.MAX_VALUE & this.anInt9302].method8726(arg0, arg1);
			return true;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IZZBII)V")
	public void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) boolean local5 = arg2 & this.aClass100_Sub3_40.method8816();
		if (!local5 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
			if (arg4 == 4) {
				arg3 = arg0;
			}
			arg4 = 2;
		}
		if (arg4 != 0 && arg1) {
			arg4 |= Integer.MIN_VALUE;
		}
		if (this.anInt9302 != arg4) {
			if (this.anInt9302 != 0) {
				this.aClass11Array1[this.anInt9302 & Integer.MAX_VALUE].method8727();
			}
			if (arg4 != 0) {
				this.aClass11Array1[Integer.MAX_VALUE & arg4].method8728(arg1);
				this.aClass11Array1[arg4 & Integer.MAX_VALUE].method8724(arg1);
				this.aClass11Array1[arg4 & Integer.MAX_VALUE].method8723(arg0, arg3);
			}
			this.anInt9303 = arg3;
			this.anInt9311 = arg0;
			this.anInt9302 = arg4;
		} else if (this.anInt9302 != 0) {
			this.aClass11Array1[Integer.MAX_VALUE & this.anInt9302].method8724(arg1);
			if (arg0 != this.anInt9311 || this.anInt9303 != arg3) {
				this.aClass11Array1[Integer.MAX_VALUE & this.anInt9302].method8723(arg0, arg3);
				this.anInt9303 = arg3;
				this.anInt9311 = arg0;
			}
			return;
		}
	}
}
