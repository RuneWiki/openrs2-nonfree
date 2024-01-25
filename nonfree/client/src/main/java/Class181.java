import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class181 {

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public int anInt5136;

	@OriginalMember(owner = "client!op", name = "g", descriptor = "Lclient!op;")
	public Class181 aClass181_2;

	@OriginalMember(owner = "client!op", name = "i", descriptor = "Lclient!c;")
	public Class32 aClass32_8;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public int anInt5141;

	@OriginalMember(owner = "client!op", name = "q", descriptor = "I")
	public int anInt5144;

	@OriginalMember(owner = "client!op", name = "h", descriptor = "I")
	public final int anInt5139;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public final int anInt5140;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(II)V")
	public Class181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5139 = arg1;
		this.anInt5140 = arg0;
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lclient!op;I)V")
	public Class181(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1) {
		this.aClass181_2 = arg0;
		this.anInt5140 = this.aClass181_2.anInt5140;
		this.anInt5139 = arg1 + this.aClass181_2.anInt5139;
		this.aClass32_8 = this.aClass181_2.aClass32_8;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Lclient!op;")
	public Class181 method4024(@OriginalArg(1) int arg0) {
		return new Class181(this.anInt5140, arg0);
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Lclient!kv;")
	public Class139 method4028() {
		return Static300.method4099(this.anInt5140);
	}
}
