import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class22 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!bo;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "Lclient!po;")
	public Class72 aClass72_1;

	@OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
	public final int anInt555;

	@OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
	public final int anInt560;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(II)V")
	public Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt555 = arg1;
		this.anInt560 = arg0;
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!bo;I)V")
	public Class22(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		this.aClass22_1 = arg0;
		this.anInt555 = arg1 + this.aClass22_1.anInt555;
		this.anInt560 = this.aClass22_1.anInt560;
		this.aClass72_1 = this.aClass22_1.aClass72_1;
	}
}
