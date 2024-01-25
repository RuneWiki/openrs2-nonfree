import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class49 {

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "Lclient!cia;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!cia", name = "f", descriptor = "I")
	public int anInt2381;

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "I")
	public int anInt2384;

	@OriginalMember(owner = "client!cia", name = "m", descriptor = "Lclient!hba;")
	public Class115 aClass115_1;

	@OriginalMember(owner = "client!cia", name = "q", descriptor = "I")
	public int anInt2388;

	@OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
	public final int anInt2380;

	@OriginalMember(owner = "client!cia", name = "c", descriptor = "I")
	public final int anInt2379;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(II)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2380 = arg0;
		this.anInt2379 = arg1;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)Lclient!ega;")
	public Class81 method2062() {
		return Static45.method8619(this.anInt2380);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(II)Lclient!cia;")
	public Class49 method2067(@OriginalArg(1) int arg0) {
		return new Class49(this.anInt2380, arg0);
	}
}
