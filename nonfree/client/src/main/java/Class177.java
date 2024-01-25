import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class177 {

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public int anInt5138;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public int anInt5139;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public int anInt5140;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	public int anInt5142 = 128;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
	public int anInt5144 = 128;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	public int anInt5145;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class177(@OriginalArg(0) int arg0) {
		this.anInt5145 = arg0;
	}

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(IIIIII)V")
	private Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5145 = arg0;
		this.anInt5138 = arg3;
		this.anInt5139 = arg4;
		this.anInt5142 = arg1;
		this.anInt5140 = arg5;
		this.anInt5144 = arg2;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!ji;)V")
	public void method4293(@OriginalArg(1) Class177 arg0) {
		this.anInt5140 = arg0.anInt5140;
		this.anInt5144 = arg0.anInt5144;
		this.anInt5142 = arg0.anInt5142;
		this.anInt5139 = arg0.anInt5139;
		this.anInt5138 = arg0.anInt5138;
		this.anInt5145 = arg0.anInt5145;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lclient!ji;")
	public Class177 method4295() {
		return new Class177(this.anInt5145, this.anInt5142, this.anInt5144, this.anInt5138, this.anInt5139, this.anInt5140);
	}
}
