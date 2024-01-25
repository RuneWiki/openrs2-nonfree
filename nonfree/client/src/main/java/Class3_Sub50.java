import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public final class Class3_Sub50 extends Class3 {

	@OriginalMember(owner = "client!uia", name = "o", descriptor = "I")
	public final int anInt9448;

	@OriginalMember(owner = "client!uia", name = "n", descriptor = "I")
	public final int anInt9447;

	@OriginalMember(owner = "client!uia", name = "<init>", descriptor = "(II)V")
	public Class3_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9448 = arg1;
		this.anInt9447 = arg0;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(B)Z")
	public boolean method8087() {
		return (this.anInt9447 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(B)I")
	public int method8089() {
		return Static357.method5759(this.anInt9447);
	}

	@OriginalMember(owner = "client!uia", name = "c", descriptor = "(B)I")
	public int method8090() {
		return this.anInt9447 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!uia", name = "a", descriptor = "(IB)Z")
	public boolean method8091(@OriginalArg(0) int arg0) {
		return (this.anInt9447 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uia", name = "d", descriptor = "(B)Z")
	public boolean method8092() {
		return (this.anInt9447 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uia", name = "b", descriptor = "(I)Z")
	public boolean method8095() {
		return (this.anInt9447 & 0x1) != 0;
	}
}
