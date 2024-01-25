import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public final class Class360 {

	@OriginalMember(owner = "client!via", name = "j", descriptor = "Z")
	private final boolean aBoolean685;

	@OriginalMember(owner = "client!via", name = "i", descriptor = "I")
	private final int anInt10070;

	@OriginalMember(owner = "client!via", name = "g", descriptor = "I")
	private final int anInt10068;

	@OriginalMember(owner = "client!via", name = "n", descriptor = "Z")
	private final boolean aBoolean686;

	@OriginalMember(owner = "client!via", name = "<init>", descriptor = "(ZIIZ)V")
	public Class360(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean685 = arg3;
		this.anInt10070 = arg1;
		this.anInt10068 = arg2;
		this.aBoolean686 = arg0;
	}

	@OriginalMember(owner = "client!via", name = "a", descriptor = "(I)Z")
	public boolean method8496() {
		return this.aBoolean685;
	}

	@OriginalMember(owner = "client!via", name = "c", descriptor = "(I)Z")
	public boolean method8498() {
		return this.aBoolean686;
	}

	@OriginalMember(owner = "client!via", name = "d", descriptor = "(I)I")
	public int method8499() {
		return this.anInt10068;
	}

	@OriginalMember(owner = "client!via", name = "b", descriptor = "(B)I")
	public int method8502() {
		return this.anInt10070;
	}
}
