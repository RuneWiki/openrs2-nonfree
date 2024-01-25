import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class47 {

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
	public int anInt1336;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public int anInt1338;

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
	public int anInt1341;

	@OriginalMember(owner = "client!dl", name = "h", descriptor = "B")
	private byte aByte11;

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class47() {
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!nj;)V")
	public Class47(@OriginalArg(0) Class1_Sub21 arg0) {
		this.aByte11 = arg0.method5721();
		this.anInt1339 = arg0.method5715();
		this.anInt1336 = arg0.method5716();
		this.anInt1343 = arg0.method5716();
		this.anInt1338 = arg0.method5716();
		this.anInt1341 = arg0.method5716();
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)I")
	public int method1106() {
		return (this.aByte11 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)I")
	public int method1108() {
		return this.aByte11 & 0x7;
	}
}
