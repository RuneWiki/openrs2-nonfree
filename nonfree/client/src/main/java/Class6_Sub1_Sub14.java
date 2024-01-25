import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public final class Class6_Sub1_Sub14 extends Class6_Sub1 {

	@OriginalMember(owner = "client!os", name = "v", descriptor = "I")
	public int anInt6403;

	@OriginalMember(owner = "client!os", name = "w", descriptor = "I")
	public int anInt6404;

	@OriginalMember(owner = "client!os", name = "y", descriptor = "I")
	public int anInt6405;

	@OriginalMember(owner = "client!os", name = "B", descriptor = "I")
	public int anInt6407;

	@OriginalMember(owner = "client!os", name = "E", descriptor = "I")
	public int anInt6409;

	@OriginalMember(owner = "client!os", name = "C", descriptor = "Lclient!pp;")
	public final Class250 aClass250_1;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "Lclient!un;")
	public final Class319 aClass319_1;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Lclient!pp;Lclient!tp;)V")
	public Class6_Sub1_Sub14(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class102_Sub6 arg1) {
		this.aClass250_1 = arg0;
		this.aClass319_1 = this.aClass250_1.method5827();
		this.method5440();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	public void method5440() {
		this.anInt6409 = this.aClass250_1.anInt6992;
		this.anInt6404 = this.aClass250_1.anInt6987;
		this.anInt6405 = this.aClass250_1.anInt6988;
		if (this.aClass250_1.aClass34_10 != null) {
			this.aClass250_1.aClass34_10.R(this.aClass319_1.anInt8956, this.aClass319_1.anInt8961, this.aClass319_1.anInt8957, Static239.anIntArray517);
		}
		this.anInt6403 = Static239.anIntArray517[0];
		this.anInt6407 = Static239.anIntArray517[2];
	}
}
