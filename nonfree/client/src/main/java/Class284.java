import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class284 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "J")
	private long aLong254;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
	private int anInt8201;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!go;)V")
	public Class284(@OriginalArg(0) Class137 arg0) {
		this.aLong254 = (long) arg0.anInt3222;
		this.anInt8201 = 1;
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "([Lclient!go;)V")
	public Class284(@OriginalArg(0) Class137[] arg0) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			this.method6961(arg0[local3]);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	private int method6960(@OriginalArg(0) int arg0) {
		return (int) (this.aLong254 >> Static199.anInt3223 * arg0) & 0xF;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLclient!go;)V")
	private void method6961(@OriginalArg(1) Class137 arg0) {
		this.aLong254 |= (long) (arg0.anInt3222 << this.anInt8201++ * Static199.anInt3223);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	public int method6963() {
		return this.anInt8201;
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Lclient!go;")
	public Class137 method6964(@OriginalArg(0) int arg0) {
		return Static199.method2812(this.method6960(arg0));
	}
}
