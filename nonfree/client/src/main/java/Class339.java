import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class339 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	private int anInt9753 = -1;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
	private int anInt9757 = 0;

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "Lclient!or;")
	private Class244 aClass244_68 = new Class244();

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Z")
	public boolean aBoolean647 = false;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "I")
	private final int anInt9762;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
	private final int anInt9755;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray20;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "[Lclient!df;")
	private Class3_Sub12[] aClass3_Sub12Array1;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(III)V")
	public Class339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9762 = arg0;
		this.anInt9755 = arg1;
		this.anIntArrayArrayArray20 = new int[this.anInt9762][3][arg2];
		this.aClass3_Sub12Array1 = new Class3_Sub12[this.anInt9755];
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	public void method7665() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9762; local7++) {
			this.anIntArrayArrayArray20[local7][0] = null;
			this.anIntArrayArrayArray20[local7][1] = null;
			this.anIntArrayArrayArray20[local7][2] = null;
			this.anIntArrayArrayArray20[local7] = null;
		}
		this.aClass3_Sub12Array1 = null;
		this.anIntArrayArrayArray20 = null;
		this.aClass244_68.method5581();
		this.aClass244_68 = null;
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(B)[[[I")
	public int[][][] method7668() {
		if (this.anInt9755 != this.anInt9762) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt9762; local21++) {
			this.aClass3_Sub12Array1[local21] = Static404.aClass3_Sub12_1;
		}
		return this.anIntArrayArrayArray20;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)[[I")
	public int[][] method7670(@OriginalArg(0) int arg0) {
		if (this.anInt9755 == this.anInt9762) {
			this.aBoolean647 = this.aClass3_Sub12Array1[arg0] == null;
			this.aClass3_Sub12Array1[arg0] = Static404.aClass3_Sub12_1;
			return this.anIntArrayArrayArray20[arg0];
		} else if (this.anInt9762 == 1) {
			this.aBoolean647 = arg0 != this.anInt9753;
			this.anInt9753 = arg0;
			return this.anIntArrayArrayArray20[0];
		} else {
			@Pc(48) Class3_Sub12 local48 = this.aClass3_Sub12Array1[arg0];
			if (local48 == null) {
				this.aBoolean647 = true;
				if (this.anInt9757 >= this.anInt9762) {
					@Pc(69) Class3_Sub12 local69 = (Class3_Sub12) this.aClass244_68.method5577();
					local48 = new Class3_Sub12(arg0, local69.anInt2332);
					this.aClass3_Sub12Array1[local69.anInt2334] = null;
					local69.method8128();
				} else {
					local48 = new Class3_Sub12(arg0, this.anInt9757);
					this.anInt9757++;
				}
				this.aClass3_Sub12Array1[arg0] = local48;
			} else {
				this.aBoolean647 = false;
			}
			this.aClass244_68.method5573(local48);
			return this.anIntArrayArrayArray20[local48.anInt2332];
		}
	}
}
