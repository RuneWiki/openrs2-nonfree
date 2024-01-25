import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class Class139 implements Interface27 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "I")
	public final int anInt11172;

	@OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
	public final int anInt11181;

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "Lclient!fe;")
	public final Class103 aClass103_12;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public final int anInt11173;

	@OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
	public final int anInt11179;

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
	public final int anInt11175;

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
	public final int anInt11180;

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "Lclient!mp;")
	public final Class236 aClass236_12;

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
	public final int anInt11174;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!mp;Lclient!fe;IIIIIII)V")
	public Class139(@OriginalArg(0) Class236 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt11172 = arg2;
		this.anInt11181 = arg6;
		this.aClass103_12 = arg1;
		this.anInt11173 = arg8;
		this.anInt11179 = arg5;
		this.anInt11175 = arg7;
		this.anInt11180 = arg3;
		this.aClass236_12 = arg0;
		this.anInt11174 = arg4;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)Lclient!hl;")
	@Override
	public Class148 method9592() {
		return null;
	}
}
