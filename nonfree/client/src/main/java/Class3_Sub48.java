import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class3_Sub48 extends Class3 {

	@OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
	public final int anInt8468;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
	private final int anInt8460;

	@OriginalMember(owner = "client!sn", name = "I", descriptor = "I")
	private final int anInt8470;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
	public final int anInt8462;

	@OriginalMember(owner = "client!sn", name = "F", descriptor = "I")
	private final int anInt8467;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
	private final int anInt8457;

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
	private final int anInt8464;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
	public final int anInt8459;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public final int anInt8456;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class3_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8468 = arg7;
		this.anInt8460 = arg4;
		this.anInt8470 = arg2;
		this.anInt8462 = arg6;
		this.anInt8467 = arg1;
		this.anInt8457 = arg0;
		this.anInt8464 = arg3;
		this.anInt8459 = arg8;
		this.anInt8456 = arg5;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)Z")
	public boolean method6631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.anInt8457 == arg2 && arg0 >= this.anInt8467 && arg0 <= this.anInt8464 && this.anInt8470 <= arg1 && arg1 <= this.anInt8460;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)Z")
	public boolean method6632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 >= this.anInt8456 && arg1 <= this.anInt8468 && this.anInt8462 <= arg0 && this.anInt8459 >= arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)Z")
	public boolean method6633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.anInt8467 <= arg0 && this.anInt8464 >= arg0 && this.anInt8470 <= arg1 && this.anInt8460 >= arg1;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II[II)V")
	public void method6635(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		arg1[1] = arg2 + this.anInt8456 - this.anInt8467;
		arg1[2] = this.anInt8462 + arg0 - this.anInt8470;
		arg1[0] = 0;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II[II)V")
	public void method6638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		arg2[2] = this.anInt8470 + arg0 - this.anInt8462;
		arg2[1] = arg1 + this.anInt8467 - this.anInt8456;
		arg2[0] = this.anInt8457;
	}
}
