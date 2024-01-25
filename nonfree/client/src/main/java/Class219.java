import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class219 {

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "J")
	private long aLong170;

	@OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
	private int anInt6417;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class219(@OriginalArg(0) Class281 arg0) {
		this.aLong170 = (long) arg0.anInt7740;
		this.anInt6417 = 1;
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "([Lclient!po;)V")
	public Class219(@OriginalArg(0) Class281[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method5343(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)I")
	private int method5339(@OriginalArg(1) int arg0) {
		return (int) (this.aLong170 >> arg0 * Static456.anInt7745) & 0xF;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)Lclient!po;")
	public Class281 method5340(@OriginalArg(0) int arg0) {
		return Static456.method6541(this.method5339(arg0));
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I")
	public int method5341() {
		return this.anInt6417;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!po;)V")
	private void method5343(@OriginalArg(1) Class281 arg0) {
		this.aLong170 |= (long) (arg0.anInt7740 << this.anInt6417++ * Static456.anInt7745);
	}
}
