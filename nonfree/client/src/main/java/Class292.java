import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class292 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
	public int anInt8319;

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
	public int anInt8320;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
	public int anInt8321;

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
	public int anInt8322;

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V")
	public Class292() {
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lclient!pt;)V")
	public Class292(@OriginalArg(0) Class292 arg0) {
		this.anInt8319 = arg0.anInt8319;
		this.anInt8320 = arg0.anInt8320;
		this.anInt8322 = arg0.anInt8322;
		this.anInt8321 = arg0.anInt8321;
	}
}
