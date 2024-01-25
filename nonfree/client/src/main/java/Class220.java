import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class220 {

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "J")
	private long aLong159;

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
	private int anInt6329;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!uba;)V")
	public Class220(@OriginalArg(0) Class326 arg0) {
		this.aLong159 = arg0.anInt9352;
		this.anInt6329 = 1;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "([Lclient!uba;)V")
	public Class220(@OriginalArg(0) Class326[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method5378(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	public int method5376() {
		return this.anInt6329;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!uba;)V")
	private void method5378(@OriginalArg(1) Class326 arg0) {
		this.aLong159 |= arg0.anInt9352 << Static525.anInt9361 * this.anInt6329++;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lclient!uba;")
	public Class326 method5379(@OriginalArg(0) int arg0) {
		return Static525.method7618(this.method5380(arg0));
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(IB)I")
	private int method5380(@OriginalArg(0) int arg0) {
		return (int) (this.aLong159 >> Static525.anInt9361 * arg0) & 0xF;
	}
}
