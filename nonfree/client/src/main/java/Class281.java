import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class281 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	public final int anInt7365;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
	public final boolean aBoolean579;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!bq;")
	public final Class33 aClass33_65;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	private final int anInt7368;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	public final int anInt7369;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Z")
	public final boolean aBoolean580;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!bq;")
	public final Class33 aClass33_66;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(ILclient!bq;I)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(ILclient!bq;Lclient!bq;II)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(ILclient!bq;Lclient!bq;IIZZ)V")
	public Class281(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt7369 = arg4;
		this.aClass33_66 = arg2;
		this.anInt7365 = arg3;
		this.aBoolean580 = arg6;
		this.aClass33_65 = arg1;
		this.anInt7368 = arg0;
		this.aBoolean579 = arg5;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)I")
	public int method6260() {
		return this.anInt7368;
	}

	@OriginalMember(owner = "client!rd", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
