import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public final class Class53 {

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "I")
	public final int anInt1431;

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "Z")
	public final boolean aBoolean95;

	@OriginalMember(owner = "client!cia", name = "d", descriptor = "Lclient!nea;")
	public final Class235 aClass235_1;

	@OriginalMember(owner = "client!cia", name = "e", descriptor = "I")
	public final int anInt1432;

	@OriginalMember(owner = "client!cia", name = "h", descriptor = "Z")
	public final boolean aBoolean96;

	@OriginalMember(owner = "client!cia", name = "i", descriptor = "Lclient!nea;")
	public final Class235 aClass235_2;

	@OriginalMember(owner = "client!cia", name = "k", descriptor = "I")
	private final int anInt1436;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(ILclient!nea;Lclient!nea;II)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(ILclient!nea;I)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(ILclient!nea;Lclient!nea;IIZZ)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) Class235 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean95 = arg5;
		this.aBoolean96 = arg6;
		this.anInt1431 = arg3;
		this.aClass235_1 = arg1;
		this.aClass235_2 = arg2;
		this.anInt1436 = arg0;
		this.anInt1432 = arg4;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)I")
	public int method1252() {
		return this.anInt1436;
	}

	@OriginalMember(owner = "client!cia", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
