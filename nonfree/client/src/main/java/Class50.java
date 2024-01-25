import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class Class50 implements Interface2 {

	@OriginalMember(owner = "client!em", name = "c", descriptor = "I")
	public final int anInt7631;

	@OriginalMember(owner = "client!em", name = "j", descriptor = "I")
	public final int anInt7637;

	@OriginalMember(owner = "client!em", name = "l", descriptor = "Lclient!vn;")
	public final Class347 aClass347_11;

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public final int anInt7638;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "I")
	public final int anInt7630;

	@OriginalMember(owner = "client!em", name = "e", descriptor = "I")
	public final int anInt7633;

	@OriginalMember(owner = "client!em", name = "i", descriptor = "Lclient!mf;")
	public final Class214 aClass214_11;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "I")
	public final int anInt7632;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public final int anInt7635;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lclient!vn;Lclient!mf;IIIIIII)V")
	public Class50(@OriginalArg(0) Class347 arg0, @OriginalArg(1) Class214 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7631 = arg6;
		this.anInt7637 = arg4;
		this.aClass347_11 = arg0;
		this.anInt7638 = arg2;
		this.anInt7630 = arg5;
		this.anInt7633 = arg3;
		this.aClass214_11 = arg1;
		this.anInt7632 = arg7;
		this.anInt7635 = arg8;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Lclient!kq;")
	@Override
	public Class184 method7073() {
		return null;
	}
}
