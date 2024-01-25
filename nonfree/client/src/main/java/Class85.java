import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class85 {

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
	public int anInt2509;

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
	public int anInt2510;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "Lclient!ci;")
	public Class21 aClass21_2;

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "Lclient!hp;")
	public Class85 aClass85_1;

	@OriginalMember(owner = "client!hp", name = "l", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
	public final int anInt2514;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
	public final int anInt2518;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
	public Class85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2514 = arg1;
		this.anInt2518 = arg0;
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lclient!hp;I)V")
	public Class85(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1) {
		this.aClass85_1 = arg0;
		this.anInt2518 = this.aClass85_1.anInt2518;
		this.aClass21_2 = this.aClass85_1.aClass21_2;
		this.anInt2514 = this.aClass85_1.anInt2514 + arg1;
	}
}
