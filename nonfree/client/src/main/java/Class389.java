import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wea")
public final class Class389 {

	@OriginalMember(owner = "client!wea", name = "o", descriptor = "Lclient!cca;")
	public Class50 aClass50_2;

	@OriginalMember(owner = "client!wea", name = "j", descriptor = "Lclient!uga;")
	public Class361 aClass361_9;

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "Lclient!wha;")
	public Class393 aClass393_2;

	@OriginalMember(owner = "client!wea", name = "A", descriptor = "Lclient!hl;")
	public Class156 aClass156_217;

	@OriginalMember(owner = "client!wea", name = "p", descriptor = "I")
	public int anInt10755;

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
	public int anInt10757;

	@OriginalMember(owner = "client!wea", name = "k", descriptor = "Lclient!hl;")
	public Class156 aClass156_218;

	@OriginalMember(owner = "client!wea", name = "E", descriptor = "Lclient!hl;")
	public Class156 aClass156_219;

	@OriginalMember(owner = "client!wea", name = "i", descriptor = "I")
	private int anInt10759;

	@OriginalMember(owner = "client!wea", name = "x", descriptor = "I")
	public int anInt10761;

	@OriginalMember(owner = "client!wea", name = "m", descriptor = "Lclient!at;")
	private final Class20 aClass20_73 = new Class20();

	@OriginalMember(owner = "client!wea", name = "z", descriptor = "I")
	private int anInt10754 = 0;

	@OriginalMember(owner = "client!wea", name = "s", descriptor = "Lclient!wq;")
	private final Class5_Sub36 aClass5_Sub36_10 = new Class5_Sub36(1350);

	@OriginalMember(owner = "client!wea", name = "t", descriptor = "Lclient!rv;")
	public final Class5_Sub36_Sub2 aClass5_Sub36_Sub2_2 = new Class5_Sub36_Sub2(15000);

	@OriginalMember(owner = "client!wea", name = "v", descriptor = "Z")
	public boolean aBoolean759 = false;

	@OriginalMember(owner = "client!wea", name = "C", descriptor = "I")
	public int anInt10758 = 0;

	@OriginalMember(owner = "client!wea", name = "n", descriptor = "I")
	public int anInt10760 = 0;

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
	public int anInt10756 = 0;

	@OriginalMember(owner = "client!wea", name = "w", descriptor = "Lclient!hl;")
	public Class156 aClass156_220 = null;

	@OriginalMember(owner = "client!wea", name = "h", descriptor = "Z")
	public boolean aBoolean760 = true;

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public void method9073() {
		if (this.aClass50_2 != null) {
			this.aClass50_2.method6168();
			this.aClass50_2 = null;
		}
	}

	@OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)V")
	public void method9074() {
		if (Static565.anInt8921 % 50 == 0) {
			this.anInt10755 = this.anInt10759;
			this.anInt10759 = 0;
			this.anInt10761 = this.anInt10757;
			this.anInt10757 = 0;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
	public void method9077() {
		this.aClass20_73.method374();
		this.anInt10754 = 0;
	}

	@OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
	public void method9078(@OriginalArg(0) int arg0) throws IOException {
		if (this.aClass50_2 != null && this.anInt10754 > 0) {
			this.aClass5_Sub36_10.anInt8456 = 0;
			while (true) {
				@Pc(28) Class5_Sub41 local28 = (Class5_Sub41) this.aClass20_73.method378();
				if (local28 == null || local28.anInt6761 > this.aClass5_Sub36_10.aByteArray89.length - this.aClass5_Sub36_10.anInt8456) {
					this.aClass50_2.method6167(this.aClass5_Sub36_10.aByteArray89, this.aClass5_Sub36_10.anInt8456);
					this.anInt10759 += this.aClass5_Sub36_10.anInt8456;
					this.anInt10760 = 0;
					break;
				}
				this.aClass5_Sub36_10.method7313(0, local28.anInt6761, local28.aClass5_Sub36_Sub2_1.aByteArray89);
				this.anInt10754 -= local28.anInt6761;
				local28.method9222();
				local28.aClass5_Sub36_Sub2_1.method7323();
				local28.method5856();
			}
		}
		if (arg0 < 85) {
			this.aClass156_218 = null;
		}
	}

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!nq;I)V")
	public void method9079(@OriginalArg(0) Class5_Sub41 arg0) {
		this.aClass20_73.method370(arg0);
		arg0.anInt6761 = arg0.aClass5_Sub36_Sub2_1.anInt8456;
		this.anInt10754 += arg0.anInt6761;
		arg0.aClass5_Sub36_Sub2_1.anInt8456 = 0;
	}
}
