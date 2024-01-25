import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class12_Sub4_Sub16 extends Class12_Sub4 {

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
	public int anInt8053;

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!rt", name = "L", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "I")
	public int anInt8060;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "Lclient!rn;")
	public final Class265 aClass265_2;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "Lclient!fl;")
	public final Class102 aClass102_1;

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lclient!rn;Lclient!jw;)V")
	public Class12_Sub4_Sub16(@OriginalArg(0) Class265 arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		this.aClass265_2 = arg0;
		this.aClass102_1 = this.aClass265_2.method6595();
		this.method6660();
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(B)V")
	public void method6660() {
		this.anInt8053 = this.aClass265_2.anInt7974;
		this.anInt8059 = this.aClass265_2.anInt7975;
		this.anInt8054 = this.aClass265_2.anInt7972;
		if (this.aClass265_2.aClass91_6 != null) {
			this.aClass265_2.aClass91_6.I(this.aClass102_1.anInt3115, this.aClass102_1.anInt3116, this.aClass102_1.anInt3105, Static474.anIntArray643);
		}
		this.anInt8052 = Static474.anIntArray643[0];
		this.anInt8060 = Static474.anIntArray643[2];
	}
}
