import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class248 {

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "F")
	public float aFloat137 = 1.0F;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "F")
	public float aFloat141 = 1.0F;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "F")
	public float aFloat136 = 0.25F;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
	public final int anInt6765;

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "I")
	public final int anInt6768;

	@OriginalMember(owner = "client!nt", name = "o", descriptor = "F")
	public final float aFloat140;

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "F")
	public final float aFloat139;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "F")
	public final float aFloat138;

	@OriginalMember(owner = "client!nt", name = "e", descriptor = "I")
	public final int anInt6766;

	@OriginalMember(owner = "client!nt", name = "t", descriptor = "I")
	public final int anInt6774;

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "Lclient!tea;")
	public final Class91 aClass91_3;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	public final int anInt6776;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	public final int anInt6772;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "()V")
	public Class248() {
		this.anInt6765 = 0;
		this.anInt6768 = -50;
		this.aFloat140 = 1.2F;
		this.aFloat139 = 0.69921875F;
		this.aFloat138 = 1.1523438F;
		this.anInt6766 = Static135.anInt2217;
		this.anInt6774 = Static538.anInt8954;
		this.aClass91_3 = Static489.aClass91_4;
		this.anInt6776 = -50;
		this.anInt6772 = -60;
	}

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!ee;)V")
	public Class248(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(16) int local16 = arg0.method8645();
		if (Static627.aClass5_Sub46_31.aClass11_Sub11_1.method2927() == 1 && Static540.aClass126_21.method7032() > 0) {
			if ((local16 & 0x1) == 0) {
				this.anInt6766 = Static135.anInt2217;
			} else {
				this.anInt6766 = arg0.method8623();
			}
			if ((local16 & 0x2) == 0) {
				this.aFloat138 = 1.1523438F;
			} else {
				this.aFloat138 = (float) arg0.method8631() / 256.0F;
			}
			if ((local16 & 0x4) == 0) {
				this.aFloat139 = 0.69921875F;
			} else {
				this.aFloat139 = (float) arg0.method8631() / 256.0F;
			}
			if ((local16 & 0x8) == 0) {
				this.aFloat140 = 1.2F;
			} else {
				this.aFloat140 = (float) arg0.method8631() / 256.0F;
			}
		} else {
			if ((local16 & 0x1) != 0) {
				arg0.method8623();
			}
			if ((local16 & 0x2) != 0) {
				arg0.method8631();
			}
			if ((local16 & 0x4) != 0) {
				arg0.method8631();
			}
			if ((local16 & 0x8) != 0) {
				arg0.method8631();
			}
			this.aFloat139 = 0.69921875F;
			this.anInt6766 = Static135.anInt2217;
			this.aFloat140 = 1.2F;
			this.aFloat138 = 1.1523438F;
		}
		if ((local16 & 0x10) == 0) {
			this.anInt6768 = -50;
			this.anInt6776 = -50;
			this.anInt6772 = -60;
		} else {
			this.anInt6768 = arg0.method8595();
			this.anInt6772 = arg0.method8595();
			this.anInt6776 = arg0.method8595();
		}
		if ((local16 & 0x20) == 0) {
			this.anInt6774 = Static538.anInt8954;
		} else {
			this.anInt6774 = arg0.method8623();
		}
		if ((local16 & 0x40) == 0) {
			this.anInt6765 = 0;
		} else {
			this.anInt6765 = arg0.method8631();
		}
		if ((local16 & 0x80) == 0) {
			this.aClass91_3 = Static489.aClass91_4;
		} else {
			@Pc(218) int local218 = arg0.method8631();
			@Pc(222) int local222 = arg0.method8631();
			@Pc(226) int local226 = arg0.method8631();
			@Pc(230) int local230 = arg0.method8631();
			@Pc(234) int local234 = arg0.method8631();
			@Pc(238) int local238 = arg0.method8631();
			this.aClass91_3 = Static577.method8148(local222, local230, local226, local238, local234, local218);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILclient!nt;)Z")
	public boolean method5961(@OriginalArg(1) Class248 arg0) {
		return this.anInt6766 == arg0.anInt6766 && arg0.aFloat138 == this.aFloat138 && arg0.aFloat139 == this.aFloat139 && this.aFloat140 == arg0.aFloat140 && arg0.aFloat136 == this.aFloat136 && arg0.aFloat141 == this.aFloat141 && arg0.aFloat137 == this.aFloat137 && this.anInt6774 == arg0.anInt6774 && arg0.anInt6765 == this.anInt6765 && arg0.aClass91_3 == this.aClass91_3;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ee;B)V")
	public void method5964(@OriginalArg(0) Class5_Sub12 arg0) {
		this.aFloat141 = (float) (arg0.method8645() * 8) / 255.0F;
		this.aFloat136 = (float) (arg0.method8645() * 8) / 255.0F;
		this.aFloat137 = (float) (arg0.method8645() * 8) / 255.0F;
	}
}
