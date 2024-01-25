import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class248 {

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
	private int anInt7865 = 0;

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
	private int anInt7866 = 0;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "I")
	private int anInt7868 = 0;

	@OriginalMember(owner = "client!pba", name = "i", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_33;

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "Lclient!pr;")
	private final Class264 aClass264_5;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "[Lclient!jca;")
	private final Class13[] aClass13Array1;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "Lclient!dm;")
	public final Class13_Sub2 aClass13_Sub2_1;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class248(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_33 = arg0;
		this.aClass264_5 = new Class264(arg0);
		this.aClass13Array1 = new Class13[10];
		this.aClass13Array1[1] = new Class13_Sub9(arg0);
		this.aClass13Array1[2] = new Class13_Sub1(arg0, this.aClass264_5);
		this.aClass13Array1[4] = new Class13_Sub4(arg0, this.aClass264_5);
		this.aClass13Array1[5] = new Class13_Sub8(arg0, this.aClass264_5);
		this.aClass13Array1[6] = new Class13_Sub7(arg0);
		this.aClass13Array1[7] = new Class13_Sub6(arg0);
		this.aClass13Array1[3] = this.aClass13_Sub2_1 = new Class13_Sub2(arg0);
		this.aClass13Array1[8] = new Class13_Sub3(arg0, this.aClass264_5);
		this.aClass13Array1[9] = new Class13_Sub5(arg0, this.aClass264_5);
		if (!this.aClass13Array1[8].method8265()) {
			this.aClass13Array1[8] = this.aClass13Array1[4];
		}
		if (!this.aClass13Array1[9].method8265()) {
			this.aClass13Array1[9] = this.aClass13Array1[8];
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(II)Z")
	public boolean method6512() {
		return this.aClass13Array1[3].method8265();
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZLclient!tha;)Z")
	public boolean method6515(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1) {
		if (this.anInt7865 == 0) {
			return false;
		} else {
			this.aClass13Array1[Integer.MAX_VALUE & this.anInt7865].method8264(arg1, arg0);
			return true;
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZIIZIB)V")
	public void method6517(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(16) boolean local16 = arg3 & this.aClass16_Sub3_33.method6102();
		if (!local16 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
			if (arg1 == 4) {
				arg2 = arg4;
			}
			arg1 = 2;
		}
		if (arg1 != 0 && arg0) {
			arg1 |= Integer.MIN_VALUE;
		}
		if (arg1 != this.anInt7865) {
			if (this.anInt7865 != 0) {
				this.aClass13Array1[Integer.MAX_VALUE & this.anInt7865].method8260();
			}
			if (arg1 != 0) {
				this.aClass13Array1[Integer.MAX_VALUE & arg1].method8268(arg0);
				this.aClass13Array1[Integer.MAX_VALUE & arg1].method8266(arg0);
				this.aClass13Array1[Integer.MAX_VALUE & arg1].method8263(arg4, arg2);
			}
			this.anInt7866 = arg2;
			this.anInt7868 = arg4;
			this.anInt7865 = arg1;
		} else if (this.anInt7865 != 0) {
			this.aClass13Array1[Integer.MAX_VALUE & this.anInt7865].method8266(arg0);
			if (this.anInt7868 != arg4 || this.anInt7866 != arg2) {
				this.aClass13Array1[Integer.MAX_VALUE & this.anInt7865].method8263(arg4, arg2);
				this.anInt7866 = arg2;
				this.anInt7868 = arg4;
			}
			return;
		}
	}
}
