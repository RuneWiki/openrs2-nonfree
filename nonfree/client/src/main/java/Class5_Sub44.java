import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class5_Sub44 extends Class5 {

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	public final int anInt6436;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "I")
	public final int anInt6432;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(II)V")
	public Class5_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6436 = arg0;
		this.anInt6432 = arg1;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(I)Z")
	public boolean method5746() {
		return (this.anInt6436 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)Z")
	public boolean method5747() {
		return (this.anInt6436 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)I")
	public int method5748() {
		return Static66.method5194(this.anInt6436);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(II)Z")
	public boolean method5750(@OriginalArg(1) int arg0) {
		return (this.anInt6436 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)Z")
	public boolean method5751() {
		return (this.anInt6436 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)I")
	public int method5752() {
		return this.anInt6436 >> 18 & 0x7;
	}
}
