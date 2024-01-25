import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public final class Class274 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	public int anInt7944;

	@OriginalMember(owner = "client!st", name = "c", descriptor = "I")
	public int anInt7945;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "I")
	public int anInt7950;

	@OriginalMember(owner = "client!st", name = "g", descriptor = "I")
	public int anInt7949 = 128;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "I")
	public int anInt7943 = 128;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "I")
	public int anInt7948;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(I)V")
	public Class274(@OriginalArg(0) int arg0) {
		this.anInt7948 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIII)V")
	private Class274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7943 = arg2;
		this.anInt7950 = arg4;
		this.anInt7945 = arg5;
		this.anInt7949 = arg1;
		this.anInt7948 = arg0;
		this.anInt7944 = arg3;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Lclient!st;")
	public Class274 method7002() {
		return new Class274(this.anInt7948, this.anInt7949, this.anInt7943, this.anInt7944, this.anInt7950, this.anInt7945);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!st;I)V")
	public void method7003(@OriginalArg(0) Class274 arg0) {
		this.anInt7948 = arg0.anInt7948;
		this.anInt7943 = arg0.anInt7943;
		this.anInt7949 = arg0.anInt7949;
		this.anInt7950 = arg0.anInt7950;
		this.anInt7945 = arg0.anInt7945;
		this.anInt7944 = arg0.anInt7944;
	}
}
