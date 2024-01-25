import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	public final int anInt316;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	public final int anInt317;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt316 = arg1;
		this.anInt317 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)Z")
	public boolean method241() {
		return (this.anInt317 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
	public int method242() {
		return this.anInt317 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Z")
	public boolean method244(@OriginalArg(0) int arg0) {
		return (this.anInt317 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
	public int method245() {
		return Static566.method7607(this.anInt317);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Z")
	public boolean method246() {
		return (this.anInt317 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)Z")
	public boolean method247() {
		return (this.anInt317 & 0x1) != 0;
	}
}
