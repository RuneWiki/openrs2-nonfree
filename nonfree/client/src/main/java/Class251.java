import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class251 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "Lclient!kea;")
	public final Class176 aClass176_63;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public final int anInt7692;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	private final int anInt7694;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "Z")
	public final boolean aBoolean657;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!kea;")
	public final Class176 aClass176_64;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
	public final int anInt7696;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "Z")
	public final boolean aBoolean658;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILclient!kea;I)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILclient!kea;Lclient!kea;II)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(ILclient!kea;Lclient!kea;IIZZ)V")
	public Class251(@OriginalArg(0) int arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.aBoolean657 = arg5;
		this.aClass176_63 = arg2;
		this.anInt7692 = arg4;
		this.anInt7694 = arg0;
		this.aBoolean658 = arg6;
		this.aClass176_64 = arg1;
		this.anInt7696 = arg3;
	}

	@OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)I")
	public int method6446() {
		return this.anInt7694;
	}
}
