import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class Class138 implements Interface4 {

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public final int anInt4160;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
	public final int anInt4158;

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public final int anInt4159;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!jg;")
	public final Class174 aClass174_8;

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "Lclient!jha;")
	public final Class176 aClass176_8;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(ILclient!jg;Lclient!jha;II)V")
	public Class138(@OriginalArg(0) int arg0, @OriginalArg(1) Class174 arg1, @OriginalArg(2) Class176 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt4160 = arg4;
		this.anInt4158 = arg3;
		this.anInt4159 = arg0;
		this.aClass174_8 = arg1;
		this.aClass176_8 = arg2;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static25.aClass184_2;
	}
}
