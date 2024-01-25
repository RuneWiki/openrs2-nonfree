import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class131 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public final int anInt3618;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	private final int anInt3619;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public final int anInt3620;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "Z")
	public final boolean aBoolean274;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "Lclient!rj;")
	public final Class303 aClass303_1;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "Z")
	public final boolean aBoolean275;

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "Lclient!rj;")
	public final Class303 aClass303_2;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(ILclient!rj;I)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(2) int arg2) {
		this(arg0, arg1, arg1, arg2, arg2, true, false);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(ILclient!rj;Lclient!rj;II)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(2) Class303 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this(arg0, arg1, arg2, arg3, arg4, true, false);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(ILclient!rj;Lclient!rj;IIZZ)V")
	public Class131(@OriginalArg(0) int arg0, @OriginalArg(1) Class303 arg1, @OriginalArg(2) Class303 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3618 = arg4;
		this.aClass303_1 = arg2;
		this.anInt3620 = arg3;
		this.aBoolean275 = arg5;
		this.aClass303_2 = arg1;
		this.anInt3619 = arg0;
		this.aBoolean274 = arg6;
	}

	@OriginalMember(owner = "client!gp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)I")
	public int method3020() {
		return this.anInt3619;
	}
}
