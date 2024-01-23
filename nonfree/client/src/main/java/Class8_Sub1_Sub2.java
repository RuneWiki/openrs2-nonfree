import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	public int anInt640 = -1;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "I")
	public int anInt648 = -1;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "I")
	public int anInt650 = 12800;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	public int anInt649 = 0;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public int anInt642 = 0;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
	public int anInt644 = 12800;

	@OriginalMember(owner = "client!bi", name = "S", descriptor = "Z")
	public boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "Ljava/lang/String;")
	public String aString19;

	@OriginalMember(owner = "client!bi", name = "R", descriptor = "Ljava/lang/String;")
	public String aString20;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "Lclient!wn;")
	public Class182 aClass182_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class8_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt648 = arg4;
		this.aBoolean43 = arg5;
		this.anInt647 = arg3;
		this.aString19 = arg2;
		this.anInt640 = arg6;
		this.aString20 = arg1;
		if (this.anInt640 == 255) {
			this.anInt640 = 0;
		}
		this.anInt646 = arg0;
		this.aClass182_1 = new Class182();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)Z")
	public boolean method421(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class8_Sub6 local11 = (Class8_Sub6) this.aClass182_1.method4319(); local11 != null; local11 = (Class8_Sub6) this.aClass182_1.method4329()) {
			if (local11.method475(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)[I")
	public int[] method422(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) Class8_Sub6 local13 = (Class8_Sub6) this.aClass182_1.method4319(); local13 != null; local13 = (Class8_Sub6) this.aClass182_1.method4329()) {
			if (local13.method473(arg0, arg1)) {
				return local13.method476(arg0, arg1);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BIII)[I")
	public int[] method423(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class8_Sub6 local11 = (Class8_Sub6) this.aClass182_1.method4319(); local11 != null; local11 = (Class8_Sub6) this.aClass182_1.method4329()) {
			if (local11.method470(arg0, arg2, arg1)) {
				return local11.method478(arg1, arg2);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)[I")
	public int[] method425(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class8_Sub6 local11 = (Class8_Sub6) this.aClass182_1.method4319(); local11 != null; local11 = (Class8_Sub6) this.aClass182_1.method4329()) {
			if (local11.method475(arg1, arg0)) {
				return local11.method478(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
	public void method431() {
		this.anInt650 = 12800;
		this.anInt649 = 0;
		this.anInt644 = 12800;
		this.anInt642 = 0;
		for (@Pc(23) Class8_Sub6 local23 = (Class8_Sub6) this.aClass182_1.method4319(); local23 != null; local23 = (Class8_Sub6) this.aClass182_1.method4329()) {
			if (local23.anInt700 > this.anInt649) {
				this.anInt649 = local23.anInt700;
			}
			if (this.anInt650 > local23.anInt703) {
				this.anInt650 = local23.anInt703;
			}
			if (this.anInt642 < local23.anInt697) {
				this.anInt642 = local23.anInt697;
			}
			if (this.anInt644 > local23.anInt688) {
				this.anInt644 = local23.anInt688;
			}
		}
	}
}
