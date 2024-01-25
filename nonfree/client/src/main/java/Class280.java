import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class280 {

	@OriginalMember(owner = "client!pfa", name = "h", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
	private int anInt8176;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!ua;)V")
	public Class280(@OriginalArg(0) Class354 arg0) {
		this.aLong228 = (long) arg0.anInt10297;
		this.anInt8176 = 1;
	}

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "([Lclient!ua;)V")
	public Class280(@OriginalArg(0) Class354[] arg0) {
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			this.method7307(arg0[local5]);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZI)I")
	private int method7301(@OriginalArg(1) int arg0) {
		return (int) (this.aLong228 >> arg0 * Static591.anInt10303) & 0xF;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)I")
	public int method7302() {
		return this.anInt8176;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ZI)Lclient!ua;")
	public Class354 method7303(@OriginalArg(1) int arg0) {
		return Static591.method8906(this.method7301(arg0));
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!ua;)V")
	private void method7307(@OriginalArg(1) Class354 arg0) {
		this.aLong228 |= (long) (arg0.anInt10297 << Static591.anInt10303 * this.anInt8176++);
	}
}
