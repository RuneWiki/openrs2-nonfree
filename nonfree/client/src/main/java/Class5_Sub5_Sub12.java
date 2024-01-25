import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ija")
public final class Class5_Sub5_Sub12 extends Class5_Sub5 {

	@OriginalMember(owner = "client!ija", name = "t", descriptor = "I")
	public int anInt4369 = 0;

	@OriginalMember(owner = "client!ija", name = "F", descriptor = "I")
	public int anInt4371 = -1;

	@OriginalMember(owner = "client!ija", name = "s", descriptor = "I")
	public int anInt4373 = -1;

	@OriginalMember(owner = "client!ija", name = "y", descriptor = "I")
	public int anInt4375 = 12800;

	@OriginalMember(owner = "client!ija", name = "C", descriptor = "I")
	public int anInt4377 = 12800;

	@OriginalMember(owner = "client!ija", name = "v", descriptor = "Z")
	public boolean aBoolean341 = true;

	@OriginalMember(owner = "client!ija", name = "w", descriptor = "I")
	public int anInt4372 = 0;

	@OriginalMember(owner = "client!ija", name = "A", descriptor = "I")
	public final int anInt4368;

	@OriginalMember(owner = "client!ija", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!ija", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!ija", name = "x", descriptor = "I")
	public final int anInt4374;

	@OriginalMember(owner = "client!ija", name = "B", descriptor = "Lclient!ef;")
	public final Class102 aClass102_31;

	@OriginalMember(owner = "client!ija", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub5_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt4373 = arg4;
		this.anInt4368 = arg0;
		this.aString65 = arg2;
		this.aBoolean341 = arg5;
		this.aString64 = arg1;
		this.anInt4371 = arg6;
		this.anInt4374 = arg3;
		if (this.anInt4371 == 255) {
			this.anInt4371 = 0;
		}
		this.aClass102_31 = new Class102();
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(I)V")
	public void method3737() {
		this.anInt4372 = 0;
		this.anInt4377 = 12800;
		this.anInt4375 = 12800;
		this.anInt4369 = 0;
		for (@Pc(28) Class5_Sub55 local28 = (Class5_Sub55) this.aClass102_31.method1916(); local28 != null; local28 = (Class5_Sub55) this.aClass102_31.method1915()) {
			if (local28.anInt10620 > this.anInt4372) {
				this.anInt4372 = local28.anInt10620;
			}
			if (this.anInt4369 < local28.anInt10623) {
				this.anInt4369 = local28.anInt10623;
			}
			if (this.anInt4375 > local28.anInt10613) {
				this.anInt4375 = local28.anInt10613;
			}
			if (this.anInt4377 > local28.anInt10626) {
				this.anInt4377 = local28.anInt10626;
			}
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III)Z")
	public boolean method3738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(19) Class5_Sub55 local19 = (Class5_Sub55) this.aClass102_31.method1916(); local19 != null; local19 = (Class5_Sub55) this.aClass102_31.method1915()) {
			if (local19.method9154(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(III[II)Z")
	public boolean method3739(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class5_Sub55 local11 = (Class5_Sub55) this.aClass102_31.method1916(); local11 != null; local11 = (Class5_Sub55) this.aClass102_31.method1915()) {
			if (local11.method9153(arg0, arg3, arg1)) {
				local11.method9150(arg3, arg2, arg1);
				return true;
			}
		}
		if (-1 != -1) {
			Static254.aLong132 = 83L;
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "b", descriptor = "(II[II)Z")
	public boolean method3740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(19) Class5_Sub55 local19 = (Class5_Sub55) this.aClass102_31.method1916(); local19 != null; local19 = (Class5_Sub55) this.aClass102_31.method1915()) {
			if (local19.method9149(arg0, arg1)) {
				local19.method9151(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(II[II)Z")
	public boolean method3741(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class5_Sub55 local11 = (Class5_Sub55) this.aClass102_31.method1916(); local11 != null; local11 = (Class5_Sub55) this.aClass102_31.method1915()) {
			if (local11.method9154(arg0, arg2)) {
				local11.method9150(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}
}
