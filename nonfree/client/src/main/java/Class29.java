import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class29 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
	public int anInt1371;

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
	public int anInt1373;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
	public int anInt1374;

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
	public int anInt1375;

	@OriginalMember(owner = "client!gd", name = "i", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public int anInt1377;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
	public Class29() {
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class29(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aByte2 = arg0.method203();
		this.anInt1377 = arg0.method208();
		this.anInt1373 = arg0.method213();
		this.anInt1371 = arg0.method213();
		this.anInt1374 = arg0.method213();
		this.anInt1375 = arg0.method213();
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
	public int method996() {
		return (this.aByte2 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)I")
	public int method997() {
		return this.aByte2 & 0x7;
	}
}
