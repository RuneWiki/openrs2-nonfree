import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class171 {

	@OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
	private int anInt4809 = 0;

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
	private int anInt4806 = 0;

	@OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
	private int anInt4813 = 0;

	@OriginalMember(owner = "client!jga", name = "g", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_18;

	@OriginalMember(owner = "client!jga", name = "o", descriptor = "Lclient!rb;")
	private final Class287 aClass287_2;

	@OriginalMember(owner = "client!jga", name = "d", descriptor = "[Lclient!tfa;")
	private final Class127[] aClass127Array1;

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "Lclient!mea;")
	public final Class127_Sub6 aClass127_Sub6_1;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class171(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_18 = arg0;
		this.aClass287_2 = new Class287(arg0);
		this.aClass127Array1 = new Class127[10];
		this.aClass127Array1[1] = new Class127_Sub5(arg0);
		this.aClass127Array1[2] = new Class127_Sub4(arg0, this.aClass287_2);
		this.aClass127Array1[4] = new Class127_Sub7(arg0, this.aClass287_2);
		this.aClass127Array1[5] = new Class127_Sub1(arg0, this.aClass287_2);
		this.aClass127Array1[6] = new Class127_Sub3(arg0);
		this.aClass127Array1[7] = new Class127_Sub9(arg0);
		this.aClass127Array1[3] = this.aClass127_Sub6_1 = new Class127_Sub6(arg0);
		this.aClass127Array1[8] = new Class127_Sub8(arg0, this.aClass287_2);
		this.aClass127Array1[9] = new Class127_Sub2(arg0, this.aClass287_2);
		if (!this.aClass127Array1[8].method8456()) {
			this.aClass127Array1[8] = this.aClass127Array1[4];
		}
		if (!this.aClass127Array1[9].method8456()) {
			this.aClass127Array1[9] = this.aClass127Array1[8];
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIZIZI)V")
	public void method4325(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(15) boolean local15 = arg1 & this.aClass5_Sub2_18.method7497();
		if (!local15 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
			if (arg2 == 4) {
				arg0 = arg4;
			}
			arg2 = 2;
		}
		if (arg2 != 0 && arg3) {
			arg2 |= Integer.MIN_VALUE;
		}
		if (arg2 != this.anInt4806) {
			if (this.anInt4806 != 0) {
				this.aClass127Array1[Integer.MAX_VALUE & this.anInt4806].method8454();
			}
			if (arg2 != 0) {
				this.aClass127Array1[arg2 & Integer.MAX_VALUE].method8458(arg3);
				this.aClass127Array1[arg2 & Integer.MAX_VALUE].method8457(arg3);
				this.aClass127Array1[arg2 & Integer.MAX_VALUE].method8453(arg0, arg4);
			}
			this.anInt4813 = arg4;
			this.anInt4806 = arg2;
			this.anInt4809 = arg0;
		} else if (this.anInt4806 != 0) {
			this.aClass127Array1[Integer.MAX_VALUE & this.anInt4806].method8457(arg3);
			if (arg4 != this.anInt4813 || this.anInt4809 != arg0) {
				this.aClass127Array1[Integer.MAX_VALUE & this.anInt4806].method8453(arg0, arg4);
				this.anInt4813 = arg4;
				this.anInt4809 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(II)Z")
	public boolean method4326() {
		return this.aClass127Array1[3].method8456();
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(Lclient!ou;II)Z")
	public boolean method4328(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4806 == 0) {
			return false;
		} else {
			this.aClass127Array1[Integer.MAX_VALUE & this.anInt4806].method8460(arg0, arg1);
			return true;
		}
	}
}
