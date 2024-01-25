import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class38 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
	public int anInt975;

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
	public int anInt977;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public int anInt980;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "I")
	public int anInt981;

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
	public int anInt982;

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
	public int anInt984;

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
	public int anInt985;

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public int anInt988;

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
	public int anInt979 = 128;

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
	public int anInt978 = 128;

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "I")
	public int anInt986;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		this.anInt986 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(IIIIII)V")
	private Class38(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt985 = arg4;
		this.anInt979 = arg1;
		this.anInt986 = arg0;
		this.anInt978 = arg2;
		this.anInt982 = arg3;
		this.anInt975 = arg5;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!bs;I)V")
	public void method935(@OriginalArg(0) Class38 arg0) {
		this.anInt978 = arg0.anInt978;
		this.anInt979 = arg0.anInt979;
		this.anInt986 = arg0.anInt986;
		this.anInt975 = arg0.anInt975;
		this.anInt985 = arg0.anInt985;
		this.anInt982 = arg0.anInt982;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)Lclient!bs;")
	public Class38 method936() {
		return new Class38(this.anInt986, this.anInt979, this.anInt978, this.anInt982, this.anInt985, this.anInt975);
	}
}
