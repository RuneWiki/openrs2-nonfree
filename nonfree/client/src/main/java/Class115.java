import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class115 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
	public int anInt3423;

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
	public int anInt3426;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "Lclient!kh;")
	public Class115 aClass115_2;

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
	public int anInt3427;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "Lclient!wr;")
	public Class109 aClass109_23;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
	public final int anInt3425;

	@OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
	public final int anInt3429;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V")
	public Class115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3425 = arg1;
		this.anInt3429 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!kh;I)V")
	public Class115(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1) {
		this.aClass115_2 = arg0;
		this.anInt3429 = this.aClass115_2.anInt3429;
		this.aClass109_23 = this.aClass115_2.aClass109_23;
		this.anInt3425 = this.aClass115_2.anInt3425 + arg1;
	}
}
