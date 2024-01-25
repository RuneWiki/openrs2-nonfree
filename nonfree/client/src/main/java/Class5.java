import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	private int anInt68 = 0;

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
	private int anInt70 = 0;

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!ih;")
	private Class112 aClass112_1 = null;

	@OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
	private int anInt73 = 0;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!po;")
	private final Class194 aClass194_1;

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "[Lclient!g;")
	private final Class72[] aClass72Array1;

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!tl;")
	public final Class72_Sub6 aClass72_Sub6_1;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class5(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_1 = arg0;
		this.aClass194_1 = new Class194(arg0);
		this.aClass72Array1 = new Class72[10];
		this.aClass72Array1[1] = new Class72_Sub4(arg0);
		this.aClass72Array1[2] = new Class72_Sub9(arg0, this.aClass194_1);
		this.aClass72Array1[4] = new Class72_Sub5(arg0, this.aClass194_1);
		this.aClass72Array1[5] = new Class72_Sub1(arg0, this.aClass194_1);
		this.aClass72Array1[6] = new Class72_Sub8(arg0);
		this.aClass72Array1[7] = new Class72_Sub7(arg0);
		this.aClass72Array1[3] = this.aClass72_Sub6_1 = new Class72_Sub6(arg0);
		this.aClass72Array1[8] = new Class72_Sub2(arg0, this.aClass194_1);
		this.aClass72Array1[9] = new Class72_Sub3(arg0, this.aClass194_1);
		if (!this.aClass72Array1[8].method5961()) {
			this.aClass72Array1[8] = this.aClass72Array1[4];
		}
		if (!this.aClass72Array1[9].method5961()) {
			this.aClass72Array1[9] = this.aClass72Array1[8];
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)Z")
	public boolean method27() {
		return this.aClass72Array1[3].method5961();
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ih;BI)Z")
	public boolean method28(@OriginalArg(0) Class112 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt68 == 0) {
			return false;
		}
		if (arg0 != this.aClass112_1) {
			this.aClass72Array1[this.anInt68 & Integer.MAX_VALUE].method5963(arg1, arg0);
			this.aClass112_1 = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZII)V")
	public void method30(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 != this.anInt73 | arg0 != this.anInt70) & this.anInt68 != 0) {
			this.aClass72Array1[Integer.MAX_VALUE & this.anInt68].method5965(arg1, arg0);
			this.anInt73 = arg1;
			this.anInt70 = arg0;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZZB)V")
	public void method31(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) boolean local9 = arg1 & this.aClass172_Sub2_1.method5508();
		if (!local9 && (arg0 == 4 || arg0 == 8)) {
			arg0 = 2;
		}
		if (arg0 != 0 && arg2) {
			arg0 |= Integer.MIN_VALUE;
		}
		if (arg0 != this.anInt68) {
			if (this.anInt68 != 0) {
				this.aClass72Array1[this.anInt68 & Integer.MAX_VALUE].method5960();
			}
			if (arg0 != 0) {
				this.aClass72Array1[arg0 & Integer.MAX_VALUE].method5966(arg2);
				this.aClass72Array1[arg0 & Integer.MAX_VALUE].method5970(arg2);
			}
			this.anInt70 = Integer.MIN_VALUE;
			this.anInt73 = Integer.MIN_VALUE;
			this.aClass112_1 = null;
			this.anInt68 = arg0;
		} else if (this.anInt68 != 0) {
			this.aClass72Array1[Integer.MAX_VALUE & this.anInt68].method5970(arg2);
			return;
		}
	}
}
