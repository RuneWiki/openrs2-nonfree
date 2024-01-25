import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public final class Class208 {

	@OriginalMember(owner = "client!kja", name = "c", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!kja", name = "b", descriptor = "J")
	public long aLong198;

	@OriginalMember(owner = "client!kja", name = "a", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!kja", name = "d", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class208(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aShortArray103 = arg3;
		this.aLong198 = arg0;
		this.aShortArray102 = arg2;
		this.anIntArray333 = arg1;
	}

	@OriginalMember(owner = "client!kja", name = "<init>", descriptor = "()V")
	private Class208() {
	}
}
