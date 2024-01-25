import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class323 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Z")
	private final boolean aBoolean668;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	private final int anInt9270;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
	private final int anInt9271;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ZIIZ)V")
	public Class323(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean667 = arg3;
		this.aBoolean668 = arg0;
		this.anInt9270 = arg1;
		this.anInt9271 = arg2;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Z")
	public boolean method7988() {
		return this.aBoolean667;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)Z")
	public boolean method7989() {
		return this.aBoolean668;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)I")
	public int method7990() {
		return this.anInt9270;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)I")
	public int method7991() {
		return this.anInt9271;
	}
}
