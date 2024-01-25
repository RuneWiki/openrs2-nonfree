import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class150 {

	@OriginalMember(owner = "client!kv", name = "i", descriptor = "I")
	public final int anInt4164;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
	public final int anInt4157;

	@OriginalMember(owner = "client!kv", name = "j", descriptor = "I")
	public final int anInt4165;

	@OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
	public final int anInt4161;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(IIII)V")
	public Class150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4164 = arg3;
		this.anInt4157 = arg1;
		this.anInt4165 = arg0;
		this.anInt4161 = arg2;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lclient!kv;")
	public Class150 method3378(@OriginalArg(1) int arg0) {
		return new Class150(this.anInt4165, arg0, this.anInt4161, this.anInt4164);
	}
}
