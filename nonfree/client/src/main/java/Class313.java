import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public final class Class313 {

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
	public int anInt8777;

	@OriginalMember(owner = "client!sba", name = "b", descriptor = "I")
	public int anInt8778;

	@OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
	public int anInt8779;

	@OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
	public int anInt8780;

	@OriginalMember(owner = "client!sba", name = "g", descriptor = "Lclient!sba;")
	public Class313 aClass313_1;

	@OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
	public int anInt8783;

	@OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
	public int anInt8784;

	@OriginalMember(owner = "client!sba", name = "o", descriptor = "I")
	public int anInt8788;

	@OriginalMember(owner = "client!sba", name = "p", descriptor = "I")
	public int anInt8789;

	@OriginalMember(owner = "client!sba", name = "q", descriptor = "I")
	public int anInt8790;

	@OriginalMember(owner = "client!sba", name = "m", descriptor = "I")
	private final int anInt8787;

	@OriginalMember(owner = "client!sba", name = "l", descriptor = "I")
	public final int anInt8786;

	@OriginalMember(owner = "client!sba", name = "e", descriptor = "I")
	public final int anInt8781;

	@OriginalMember(owner = "client!sba", name = "j", descriptor = "B")
	public final byte aByte123;

	@OriginalMember(owner = "client!sba", name = "t", descriptor = "I")
	public final int anInt8793;

	@OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(IIIIB)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt8787 = arg0;
		this.anInt8786 = arg3;
		this.anInt8781 = arg1;
		this.aByte123 = arg4;
		this.anInt8793 = arg2;
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)Lclient!vb;")
	public Class361 method7464() {
		return Static1.method8274(this.anInt8787);
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII)Lclient!sba;")
	public Class313 method7466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class313(this.anInt8787, arg0, arg1, arg2, this.aByte123);
	}
}
