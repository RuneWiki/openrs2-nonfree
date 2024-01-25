import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public final class Class233 implements Interface12 {

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString52;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	public final int anInt6735;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!fw;")
	public final Class114 aClass114_10;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	public final int anInt6732;

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
	public final int anInt6734;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!dg;")
	public final Class72 aClass72_9;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public final int anInt6733;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!fw;Lclient!dg;IIII)V")
	public Class233(@OriginalArg(0) String arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aString52 = arg0;
		this.anInt6735 = arg4;
		this.aClass114_10 = arg1;
		this.anInt6732 = arg3;
		this.anInt6734 = arg6;
		this.aClass72_9 = arg2;
		this.anInt6733 = arg5;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static212.aClass136_148;
	}
}
