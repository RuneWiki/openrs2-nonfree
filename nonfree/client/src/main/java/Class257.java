import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public final class Class257 {

	@OriginalMember(owner = "client!o", name = "a", descriptor = "Z")
	private final boolean aBoolean528;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "I")
	private final int anInt6979;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "I")
	private final int anInt6977;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Z")
	private final boolean aBoolean529;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ZIIZ)V")
	public Class257(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean528 = arg3;
		this.anInt6979 = arg1;
		this.anInt6977 = arg2;
		this.aBoolean529 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)Z")
	public boolean method5830() {
		return this.aBoolean528;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
	public int method5831() {
		return this.anInt6979;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I")
	public int method5832() {
		return this.anInt6977;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)Z")
	public boolean method5833() {
		return this.aBoolean529;
	}
}
